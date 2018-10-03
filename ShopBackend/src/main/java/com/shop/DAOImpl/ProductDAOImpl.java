package com.shop.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.DAO.ProductDAO;
import com.shop.Model.Category;
import com.shop.Model.Product;

@Repository(value="productDAO")
@Transactional
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean addProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);
		return true;
	}

	public void getDetails() {
	 List<Product> product=sessionFactory.getCurrentSession().createQuery("from Product").list();
	 	for(Product pr:product)
	 		{
	 			System.out.println(pr.getPid());
	 			System.out.println(pr.getPname());
	 			System.out.println(pr.getPcost());
	 			System.out.println(pr.getPqty());
	 			System.out.println(pr.getPdesc());
	 		}		
	}
	public boolean updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
		return true;
	}

	public boolean deleteProduct(String pid) {
		sessionFactory.getCurrentSession().delete(findProductById(pid));	
		return true;
	}
	
	public Product findProductById(String pid) {
		return (Product)sessionFactory.getCurrentSession().createQuery("from Product where pid='"+pid+"'").uniqueResult();
	}

	public List<Product> findAllProduct() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	public List<Category> findAllCategory() {
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}
}	
