package com.shop.ShopBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.shop.Config.DBConfig;
import com.shop.DAO.CategoryDAO;
import com.shop.Model.Category;

import junit.framework.TestCase;

public class CategoryTestCase extends TestCase {

	AbstractApplicationContext context= new AnnotationConfigApplicationContext(DBConfig.class);
	CategoryDAO categoryDAO=(CategoryDAO) context.getBean("categoryDAO");
	
	/*
	public void testUpdateCategory() 
	{
		Category category3=categoryDAO.findCategoryById("C01");
		category3.setCname("iPhonex");
		category3.setCdesc("runs ios 12");
		assertTrue(category3.getCid().equals("C01"));
		categoryDAO.updateCategory(category3);
	}
	
	public void testFindCategoryById() {
		Category categories=categoryDAO.findCategoryById("C101");
		assertNotNull(categories);
		String eId="C101"; 
		String aId=categories.getCid();
		assertTrue(eId.equals(aId));
	}
	
	public void testDeleteCategory() {
		Category category4=categoryDAO.findCategoryById("C101");
		assertEquals(true,categoryDAO.deleteCategory(category4.getCid()));
	}
	*/
	public void testAddCategory() {
		Category category=new Category();
		category.setCid("C106");
		category.setCname("iMac");
		category.setCdesc("New touch bar");
		assertEquals(true,categoryDAO.AddCategory(category));
	}
}
