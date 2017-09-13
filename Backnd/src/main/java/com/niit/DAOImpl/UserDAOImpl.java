package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.UserDAO;
import com.niit.model.User;

@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public User getByUserId(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public User getByUserName(String userame) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public User getByEmailId(String emailid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean isAllReadyRegister(String email, boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}

	@Transactional
	public void delete(int UserId) {
		// TODO Auto-generated method stub
		
	}

}
