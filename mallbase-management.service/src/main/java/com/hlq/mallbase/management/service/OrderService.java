
 /**
 * Project Name:mallbase-management.service
 * File Name:OrderService.java
 * Package Name:com.hlq.mallbse.management.service
 * Date:2017年11月7日下午5:18:24
 * Copyright (c) 2017, .
 *
*/

package com.hlq.mallbase.management.service;

import com.hlq.mallbase.management.dao.domain.Order;

/**
 * @author   hukc
 * @version  
 * @since    JDK 1.7
 * @see 	 
 */

public interface OrderService {
	public Order findOne(String id);

}

