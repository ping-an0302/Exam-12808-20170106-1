package com.hand.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hand.bean.Film;
import com.hand.dao.FilmMapper;
import com.hand.service.IFilmService;

@Component
public class FilmServiceImpl implements IFilmService{

	@Autowired
	private FilmMapper filmMapper;
	
	@Override
	public Long findSum() {
		Long sum = filmMapper.findSum();
		return sum;
	}
	
	public List<Film> findByCound_ten(int curPage){
		List<Film> list = filmMapper.findByCound_ten(curPage);
		return list;
	}
	
	@Override
	public List<Film> findByCound_twenty(int curPage) {
		List<Film> list = filmMapper.findByCound_twenty(curPage);
		return list;
	}

	@Override
	public List<Film> findByCound_fifty(int curPage) {
		List<Film> list = filmMapper.findByCound_fifty(curPage);
		return list;
	}

	@Override
	public void deleteById(Long film_id) {
		filmMapper.deleteById(film_id);
	}

	
	@Override
	public Film findById(Long film_id) {
		Film film = filmMapper.findById(film_id);
		return film;
	}

	@Override
	public void updateByFilm(Film film) {
		filmMapper.updateByFilm(film);
	}
	
	
}
