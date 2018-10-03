package com.shop.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.DAO.CategoryDAO;
import com.shop.Model.Category;

@Repository(value="categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	SessionFactory sessionfactory;
	
	public boolean AddCategory(Category category) {
		sessionfactory.getCurrentSession().save(category);
		return true;
	}

	public boolean updateCategory(Category category) {
		sessionfactory.getCurrentSession().update(category);
		return true;
	}

	public boolean deleteCategory(String cid) {
		sessionfactory.getCurrentSession().delete(findCategoryById(cid));	
		return true;
	}
	
	public Category findCategoryById(String cid) {
		return (Category)sessionfactory.getCurrentSession().createQuery("from Category where cid='"+cid+"'").uniqueResult();
	}

	public void ViewCategory() {
		List<Category> category=sessionfactory.getCurrentSession().createQuery("from Category").list();
		for(Category ct:category)
		{
			System.out.println(ct.getCid());
			System.out.println(ct.getCname());
			System.out.println(ct.getCdesc());
		}
	}

	public List<Category> listCategories() {
		return sessionfactory.getCurrentSession().createQuery("from Category").list();
	}

	

}
