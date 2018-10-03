package com.shop.ShopBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.shop.Config.DBConfig;
import com.shop.DAO.ProductDAO;
import com.shop.Model.Product;

import junit.framework.TestCase;

public class ProductTestCase extends TestCase {
	
	AbstractApplicationContext context= new AnnotationConfigApplicationContext(DBConfig.class);
	ProductDAO productDAO= (ProductDAO) context.getBean("productDAO");
	
	public void testAddProduct() {
		Product product=new Product();
		product.setPid("P102");
		product.setPname("iPhoneXR");
		product.setPdesc("92% screen to body ratio");
		product.setPqty(50);
		product.setPcost(135000);
		assertEquals(true,productDAO.addProduct(product));
	}
	
	public void testUpdateProduct() {
		Product products=productDAO.findProductById("P102");
		products.setPdesc("The all new iPhoneXR");
		products.setPcost(125000s);
		assertTrue(products.getPid().equals("P102"));
		productDAO.updateProduct(products);
	}
	
	public void testFindProductById() {
		Product product1=productDAO.findProductById("P101");
		assertNotNull(product1);
		String eid="P101";
		String aid=product1.getPid();
		assertTrue(eid.equals(aid));
	}
	
	public void testDeleteProduct() {
		Product product2=productDAO.findProductById("P101");
		assertEquals(true,productDAO.deleteProduct(product2.getPid()));
	}
	
	public void testFindAllProducts() 
	{
		List<Product> productList=productDAO.findAllProduct();
		assertNotNull(productList);
	}
}
