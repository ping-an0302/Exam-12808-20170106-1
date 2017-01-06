package com.hand.service;

import java.util.List;

import com.hand.bean.Film;

public interface IFilmService {
	
	Long findSum();
	List<Film> findByCound_ten(int curPage);
	List<Film> findByCound_twenty(int curPage);
	List<Film> findByCound_fifty(int curPage);
	void deleteById(Long film_id);
	Film findById(Long film_id);
	void updateByFilm(Film film);
	
}
