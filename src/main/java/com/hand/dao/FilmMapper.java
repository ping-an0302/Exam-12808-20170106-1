package com.hand.dao;

import java.util.List;

import com.hand.bean.Film;

public interface FilmMapper {

	//查询总条数
	Long findSum();
	//查询film数据
	List<Film> findByCound_ten(int curPage);
	List<Film> findByCound_twenty(int curPage);
	List<Film> findByCound_fifty(int curPage);
	
	//删除
	void deleteById(Long film_id);
	
	//查询一条语句
	Film findById(Long film_id);
	//修改一条语句
	void updateByFilm(Film film);
}
