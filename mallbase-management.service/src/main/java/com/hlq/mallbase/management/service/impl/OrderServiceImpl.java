/**
 * Project Name:mallbase-management.service
 * File Name:OrderServiceImpl.java
 * Package Name:com.hlq.mallbse.management.service.impl
 * Date:2017年11月7日下午5:18:40
 * Copyright (c) 2017, .
 *
 */

package com.hlq.mallbase.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlq.mallbase.management.dao.domain.Order;
import com.hlq.mallbase.management.dao.mapper.OrderMapper;
import com.hlq.mallbase.management.service.OrderService;

/**
 * @author hukc
 * @version
 * @since JDK 1.7
 * @see
 */
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public Order findOne(String id) {

		
		return orderMapper.selectById(id);

	}

}
