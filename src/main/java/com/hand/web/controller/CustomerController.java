package com.hand.web.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.bean.Film;
import com.hand.bean.LongAndList;
import com.hand.service.impl.CustomerServiceImpl;
import com.hand.service.impl.FilmServiceImpl;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	@RequestMapping("/login")
	public String showsum(HttpServletRequest request){
		String username = request.getParameter("username");
		boolean byName = customerServiceImpl.findByName(username);
		if(byName){
			return "redirect:/index";
		}else{
			return "redirect:/login";
		}
	}
	
}
