package com.niit.test;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.DAO.CategoryDAO;
import com.niit.DAO.ProductDAO;
import com.niit.DAO.SupplierDAO;
import com.niit.DAO.UserDAO;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.User;
import com.niit.model.supplier;

public class UserTest {

	public static void main (String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		UserDAO userDAO = (UserDAO) context.getBean("UserDAO");
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
		ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");
		
		User user = (User) context.getBean("user");
		Category category = (Category) context.getBean("category");
		Product product = (Product) context.getBean("product");
		supplier Supplier = (supplier) context.getBean("supplier");
		
		user.setUserName("skfr");
		user.setEmailId("jhvd@gmail.com");
		user.setPassword("jfkd");
		user.setContactNumber(98765);
		user.setAddress("s12,sejkajdh");
		user.setZipcode(75426);
		
		userDAO.saveOrUpdate(user);
		
		category.setCategoryName("hfgkjhfg");
		category.setCategoryDescription("gdhsgfhjgfj");
		
		categoryDAO.saveOrUpdate(category);
		
		product.setProductName("hfjhdj");
		product.setDescription("jdhfjds");
		product.setPrice(789);
		product.setQuantity(78);
		product.setId(01);
		
		productDAO.saveOrUpdate(product);
		
		Supplier.setSupplierName("hddsjk");
		Supplier.setContactNumber(89756);
		
		supplierDAO.saveOrUpdate(Supplier);
		
	}
	
}
