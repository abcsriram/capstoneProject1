package com.shop.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.DAO.SupplierDAO;
import com.shop.Model.Category;
import com.shop.Model.Supplier;

@Repository(value="supplierDAO")
@Transactional
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionfactory;
	
	public void addSupplier(Supplier supplier) {
		sessionfactory.getCurrentSession().save(supplier);
	}

	public void viewSupplier() {
		List<Supplier> supplier=sessionfactory.getCurrentSession().createQuery("from Supplier").list();
		for(Supplier sp:supplier)
		{
			System.out.println(sp.getSid());
			System.out.println(sp.getSname());
			System.out.println(sp.getSdesc());
		}
	}
	
	public boolean updateSupplier(Supplier supplier) {
		sessionfactory.getCurrentSession().update(supplier);
		return true;
	}

	public boolean deleteSupplier(String sid) {
		sessionfactory.getCurrentSession().delete(findSupplierById(sid));	
		return true;
	}
	
	public Supplier findSupplierById(String sid) {
		return (Supplier)sessionfactory.getCurrentSession().createQuery("from Supplier where sid='"+sid+"'").uniqueResult();
	}

}
