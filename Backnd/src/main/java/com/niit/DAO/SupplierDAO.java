package com.niit.DAO;

import java.util.List;

import com.niit.model.supplier;

public interface SupplierDAO {

	public List<supplier> list();
	
	public supplier getBySupplierName(String suppliername);		
		
    public supplier getByContactNumber(int contactnumber);
    
	public void saveOrUpdate(supplier supplier);
		
	public void delete(int supplierid);
}
