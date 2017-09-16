package com.niit.DAO;

import java.util.List;

import com.niit.model.Category;

public interface CategoryDAO {
	
	public List<Category> list();
	
	public Category getByCatId(int Catid);
	
	public void saveOrUpdate(Category category);
	
	public void delete(int Catid);

}
