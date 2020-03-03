package com.briup.service;

import java.util.List;

import com.briup.bean.Category;

public interface ICategoryService {
	public List<Category> findAll();
	
	public void deleteById(Integer id) throws Exception;
	
	public void saveOrUpdate(Category category) throws Exception;
	
	public Category findById(int id) throws Exception;
}
