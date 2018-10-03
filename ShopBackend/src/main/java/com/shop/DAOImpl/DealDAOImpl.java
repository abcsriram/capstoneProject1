package com.shop.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.DAO.DealDAO;
import com.shop.Model.Deal;
import com.shop.Model.User;

@Repository(value="dealDAO")
@Transactional
public class DealDAOImpl implements DealDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public boolean AddDeal(Deal deal) {
		sessionFactory.getCurrentSession().save(deal);
		return true;
	}

	public Deal findDealById(String dId) {
		return (Deal) sessionFactory.getCurrentSession().createQuery("from Deal where dId='"+dId+"'").uniqueResult();
	}

	public boolean UpdateDeal(Deal deal) {
		sessionFactory.getCurrentSession().update(deal);
		return false;
	}

	public boolean deleteDeal(String dId) {
		sessionFactory.getCurrentSession().delete(findDealById(dId));
		return false;
	}

	public void viewDeal() {
		List<Deal> deal1=sessionFactory.getCurrentSession().createQuery("from Deal").list();
		for(Deal dl:deal1)
		{
			System.out.println(dl.getdId());
			System.out.println(dl.getdDesc());
			System.out.println(dl.getdDisc());
		}
	}

}
