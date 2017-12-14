package com.at.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.at.service.OrderService;

public class TestCase {
	private ApplicationContext ac;
	
	@Before
	public void init(){
		ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
	}
	
	@Test
	public void testDao(){
		OrdersDao ordersDao = ac.getBean("ordersDao",OrdersDao.class);
//		ordersDao.moreMoney();
		ordersDao.lessMoney();
	}
	
	@Test
	public void testService(){
		OrderService orderService = ac.getBean("orderService",OrderService.class);
		orderService.accountMoney();
	}
}
