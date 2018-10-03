package com.shop.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.DAO.CategoryDAO;
import com.shop.Model.Category;



@Controller
public class CategoryController 
{
	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/category")
	public String showCategory(Model m)
	{
		List<Category> listCategories=categoryDAO.listCategories();
		m.addAttribute("categoryList", listCategories);
		return "Category";
	}

	@RequestMapping(value="/AddCategory",method=RequestMethod.POST)
	public String addCategory(@RequestParam("catname") String catname,@RequestParam("catdesc") String catDesc,Model m)
	{
		Category category=new Category();
		
		category.setCname(catname);
		category.setCdesc(catDesc);
		
		categoryDAO.AddCategory(category);
		
		List<Category> listCategories=categoryDAO.listCategories();
		m.addAttribute("categoryList", listCategories);
		
		return "Category";
	}
	
	@RequestMapping("/deleteCategory/{categoryId}")
	public String deleteCategory(@PathVariable("categoryId") String categoryId,Model m)
	{
		Category category=(Category)categoryDAO.findCategoryById(categoryId);
		categoryDAO.deleteCategory(category.getCid());
		
		List<Category> listCategories=categoryDAO.listCategories();
		m.addAttribute("categoryList", listCategories);
		
		return "Category";
	}
	
	@RequestMapping("/editCategory/{categoryId}")
	public String editCategory(@PathVariable("categoryId") String categoryId,Model m)
	{
		Category category=(Category)categoryDAO.findCategoryById(categoryId);
		m.addAttribute("category",category);
		return "updateCategory";
	}
	
	@RequestMapping(value="/updateCategory",method=RequestMethod.POST)
	public String updateCategory(@RequestParam("categoryId") String categoryId,@RequestParam("catname") String catname,@RequestParam("catdesc") String catDesc,Model m)
	{
		Category category=(Category)categoryDAO.findCategoryById(categoryId);
		
		category.setCname(catname);
		category.setCdesc(catDesc);
		
		categoryDAO.updateCategory(category);
		
		List<Category> listCategories=categoryDAO.listCategories();
		m.addAttribute("categoryList", listCategories);
		
		return "Category";
	}
}
