package com.shop.DAO;

import com.shop.Model.Deal;

public interface DealDAO {
	
	public boolean AddDeal(Deal deal);
	public Deal findDealById(String dId);
	public boolean UpdateDeal(Deal deal);
	public boolean deleteDeal(String dId);
	public void viewDeal();
}
