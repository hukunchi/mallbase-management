package com.hlq.mallbase.management.deploy.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hlq.mallbase.management.dao.mapper.OrderMapper;
import com.hlq.mallbase.management.service.OrderService;

/**
 * 单元测试类
 * 
 * @author hukc
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/applicationContext-mallbasemanagement.xml" })
public class BaseTest {
	@Resource
	private OrderService orderService;

	@Test
	public void init() {
		orderService.findOne("1");
		System.out.println("---------");
	}

}
