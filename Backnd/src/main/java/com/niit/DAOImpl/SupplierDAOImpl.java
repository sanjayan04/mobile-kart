package com.niit.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.DAO.SupplierDAO;
import com.niit.model.supplier;

@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public List<supplier> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public supplier getBySupplierName(String suppliername) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public supplier getBySupplierId(int supplierid) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public supplier getByContactNumber(int contactnumber) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public void saveOrUpdate(supplier supplier) {
		sessionFactory.getCurrentSession().save(supplier);
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void delete(int supplierid) {
		// TODO Auto-generated method stub
		
	}

}
