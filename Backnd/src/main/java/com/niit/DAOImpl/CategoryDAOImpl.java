package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.CategoryDAO;
import com.niit.model.Category;


@Repository("Category")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public Category getByCatId(int Catid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public void saveOrUpdate(Category category) {
		sessionFactory.getCurrentSession().save(category);
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void delete(int Catid) {
		// TODO Auto-generated method stub
		
	}
	

}
