package com.shop.DAO;

import com.shop.Model.Customer;

public interface CustomerDAO {
void registerCustomer(Customer customer);
boolean isEmailUnique(String email);
}
