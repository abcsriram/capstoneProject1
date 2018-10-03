package com.shop.DAO;

import com.shop.Model.Supplier;

public interface SupplierDAO {
	public void addSupplier(Supplier supplier);
	public void viewSupplier();
	public boolean updateSupplier(Supplier supplier);
	public boolean deleteSupplier(String sid);
	public Supplier findSupplierById(String sid);
}
