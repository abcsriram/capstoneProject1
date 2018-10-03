package com.shop.DAO;

import java.util.List;

import com.shop.Model.CartItem;
import com.shop.Model.CustomerOrder;
import com.shop.Model.User;

public interface CartItemDAO {

	void addToCart(CartItem cartItem);
	User getUser(String email);
	List<CartItem>  getCart(String email);//select * from cartitem where user_email=?
	void removeCartItem(int cartItemId);
	CustomerOrder createCustomerOrder(CustomerOrder customerOrder);
}
