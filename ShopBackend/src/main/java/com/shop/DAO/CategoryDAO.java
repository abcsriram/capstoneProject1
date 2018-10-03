package com.shop.DAO;

import java.util.List;

import com.shop.Model.Category;

public interface CategoryDAO {
	
	public boolean AddCategory(Category category);
	public void ViewCategory();
	public boolean updateCategory(Category category);
	public boolean deleteCategory(String cid);
	public Category findCategoryById(String cid);
	public List<Category> listCategories();
}
