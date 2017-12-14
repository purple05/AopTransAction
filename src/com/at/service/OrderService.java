package com.at.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.at.dao.OrdersDao;

@Service
public class OrderService {
	@Resource(name="ordersDao")
	private OrdersDao ordersDao;
	
	public void accountMoney(){
		ordersDao.lessMoney();
		int a = 12/0;
		ordersDao.moreMoney();
	}
}
