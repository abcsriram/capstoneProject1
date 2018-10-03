package com.shop.DAO;

import java.util.List;

import com.shop.Model.Category;
import com.shop.Model.Product;

public interface ProductDAO {
	public boolean addProduct(Product product);
	public void getDetails();
	public boolean updateProduct(Product product);
	public boolean deleteProduct(String pid);
	public Product findProductById(String id);
	public List<Product> findAllProduct();
	List<Category>findAllCategory();
}
