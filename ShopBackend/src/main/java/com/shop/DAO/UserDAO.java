package com.shop.DAO;

import com.shop.Model.User;

public interface UserDAO {
	public void viewUser();
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(String uid);
	public User findUserById(String uid);
}
