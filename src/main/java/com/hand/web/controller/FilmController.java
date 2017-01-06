package com.hand.web.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.bean.Film;
import com.hand.bean.LongAndList;
import com.hand.service.impl.FilmServiceImpl;

@Controller
@RequestMapping("/film")
public class FilmController {

	@Autowired
	private FilmServiceImpl filmServiceImpl;
	
	@RequestMapping("/showfirst")
	@ResponseBody
	public LongAndList showsum(){
		Long sum = filmServiceImpl.findSum();
		List<Film> list = filmServiceImpl.findByCound_ten(0);
		LongAndList longAndList = new LongAndList();
		longAndList.setSum(sum);
		longAndList.setList(list);
		return longAndList;
	}
	
	@RequestMapping("/show")
	@ResponseBody
	public LongAndList show(
			@RequestParam(name="page" ,required=false,defaultValue="1") int page, 
			@RequestParam(name="pageSize" ,required=false,defaultValue="10") int pageSize){
		Long sum = filmServiceImpl.findSum();
		LongAndList longAndList = new LongAndList();
		List<Film> list = null;
		if (pageSize==10) {
			list = filmServiceImpl.findByCound_ten((page-1)*pageSize);
		}else if (pageSize==20) {
			list = filmServiceImpl.findByCound_twenty((page-1)*pageSize);
		}else{
			list = filmServiceImpl.findByCound_fifty((page-1)*pageSize);
		}
		longAndList.setSum(sum);
		longAndList.setList(list);
		return longAndList;
	}
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request){
		String string = request.getParameter("film_id");
		long film_id = Long.parseLong(string);
		filmServiceImpl.deleteById(film_id);
		return "/delete";
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public Film update(HttpServletRequest request){
		String string = request.getParameter("id");
		long film_id = Long.parseLong(string);
		Film film = filmServiceImpl.findById(film_id);
		return film;
	}
	
	@RequestMapping("/updateinfo")
	public String updateinfo(HttpServletRequest request){
		String string = request.getParameter("film_id");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String string1 = request.getParameter("language_id");
		
		//参数类型转换
		long film_id = Long.parseLong(string);
		long language_id = Long.parseLong(string1);
		
		//封装参数
		Film film = new Film();
		film.setFilm_id(film_id);
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage_id(language_id);
		filmServiceImpl.updateByFilm(film);
		return "redirect:/index";
	}
}
