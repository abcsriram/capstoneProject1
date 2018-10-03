package com.shop.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.DAO.UserDAO;
import com.shop.Model.Supplier;
import com.shop.Model.User;

@Repository(value="userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionfactory;
	public void viewUser() {
		List<User> user1=sessionfactory.getCurrentSession().createQuery("from User").list();
		for(User ur:user1)
		{
			System.out.println(ur.getUid());
			System.out.println(ur.getUname());
			System.out.println(ur.getUemail());
			System.out.println(ur.getUpwrd());
			System.out.println(ur.getUlocation());
			System.out.println(ur.getUmobno());
		}
	}

	public boolean addUser(User user) {
		sessionfactory.getCurrentSession().save(user);
		return true;
	}
	public boolean updateUser(User user) {
		sessionfactory.getCurrentSession().update(user);
		return true;
	}

	public boolean deleteUser(String uid) {
		sessionfactory.getCurrentSession().delete(findUserById(uid));	
		return true;
	}
	
	public User findUserById(String uid) {
		return (User)sessionfactory.getCurrentSession().createQuery("from User where uid='"+uid+"'").uniqueResult();
	}

}
