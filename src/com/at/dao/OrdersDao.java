package com.at.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersDao {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	/*
	 * 做对数据库操作的方法，不写业务操作
	 * */
	//小王少钱的方法
	public void lessMoney() {
		String sql = "update account set balance=balance-? where username=?";
		jdbcTemplate.update(sql, 1000,"hx");
	}
	
	//小马多钱的方法
	public void moreMoney() {
		String sql = "update account set balance=balance+? where username=?";
		jdbcTemplate.update(sql, 1000,"hzw");
	}
	
}
