package com.hand.dao;

import com.hand.bean.Customer;

public interface CustomerMapper {

	Customer findByName(String name);
	
}
