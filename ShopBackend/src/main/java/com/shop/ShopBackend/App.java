package com.shop.ShopBackend;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.shop.Config.DBConfig;
import com.shop.DAO.CategoryDAO;
import com.shop.DAO.ProductDAO;
import com.shop.DAO.SupplierDAO;
import com.shop.DAO.UserDAO;
import com.shop.Model.Category;
import com.shop.Model.Product;
import com.shop.Model.Supplier;
import com.shop.Model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   
    	Scanner sc=new Scanner(System.in);
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
        ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
        Product product1=new Product();
        product1.setPid("2");
        product1.setPname("oneplus5T");
        product1.setPcost(35000);
        product1.setPqty(40);
        product1.setPdesc("Beyond the World");
        //productDAO.addProduct(product1);
        //productDAO.getDetails();
        //productDAO.deleteProduct("1");
        /*System.out.println("Enter the product ID to edit the datas");
        String productid=sc.nextLine();
        Product updateProduct=productDAO.findProductById(productid);
        if(updateProduct.getPid().equals(productid))
        {
        updateProduct.setPcost(45000);
        productDAO.updateProduct(updateProduct);
        System.out.println("Data updated");
        }
        else
        {
        	System.out.println("ID not found");
        }
        
        */
        
        UserDAO userDAO = (UserDAO) context.getBean("userDAO");
        User user1=new User();
        user1.setUid("U102");
        user1.setUname("Hari");
        user1.setUemail("dfhari@gmail.com");
        user1.setUpwrd("pass@123");
        user1.setUmobno("9790863864");
        user1.setUlocation("Ennore");
        //userDAO.addUser(user1);
        //userDAO.viewUser();
        //userDAO.deleteUser("U101");
        /*System.out.println("Enter the User ID to edit the datas");
        String userid=sc.nextLine();
        User updateUser=userDAO.findUserById(userid);
        if(updateUser.getUid().equals(userid))
        {
        updateUser.setUname("Rakesh");
        userDAO.updateUser(updateUser);
        System.out.println("Data updated");
        }
        else
        {
        	System.out.println("ID not found");
        }*/
        
        SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
        Supplier supplier1=new Supplier();
        supplier1.setScid("S102");
        supplier1.setSname("Suresh");
        supplier1.setSdesc("Samsung");
        //supplierDAO.addSupplier(supplier1);
        //supplierDAO.viewSupplier();
        //supplierDAO.deleteSupplier("S101");
        /*System.out.println("Enter the Supplier ID to edit the datas");
        String supplierid=sc.nextLine();
        Supplier updateSupplier=supplierDAO.findSupplierById(supplierid);
        if(updateSupplier.getSid().equals(supplierid))
        {
        updateSupplier.setSdesc("Redmi");;
        supplierDAO.updateSupplier(updateSupplier);
        System.out.println("Data updated");
        }
        else
        {
        	System.out.println("ID not found");
        }*/
        
        CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
        Category category=new Category();
        //category.setCid("C101");
        //category.setCname("Vivo");
        //category.setCdesc("Easy to use");
        //categoryDAO.AddCategory(category);
        //categoryDAO.ViewCategory();
        //categoryDAO.deleteCategory("C101");
        /*System.out.println("Enter the Category ID to edit the data");
        String id=sc.nextLine();
        Category updateCategory=categoryDAO.findCategoryById(id);
        //System.out.println(updateCategory.getCdesc());
        if(updateCategory.getCid().equals(id))
        {
        updateCategory.setCdesc("Easy to use");
        categoryDAO.updateCategory(updateCategory);
        System.out.println("Data updated");
        }
        else
        {
        	System.out.println("ID not found");
        }*/
    }
}
