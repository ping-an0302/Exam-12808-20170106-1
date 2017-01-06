package com.hand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hand.bean.Customer;
import com.hand.dao.CustomerMapper;
import com.hand.service.ICustomerService;

@Component
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private CustomerMapper customerMapper;
	
	
	@Override
	public boolean findByName(String name) {
		Customer findByName = customerMapper.findByName(name);
		
		//判断此first_name是否存在。
		if(findByName==null){
			return false;
		}else{
			return true;
		}
	}

}
