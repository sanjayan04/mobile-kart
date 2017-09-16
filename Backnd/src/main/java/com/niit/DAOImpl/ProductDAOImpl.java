package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;

@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<Product> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void saveOrUpdate(Product product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(product);
		
	}

	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
