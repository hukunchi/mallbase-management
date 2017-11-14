package com.hlq.mallbase.management.deploy.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 单元测试类
 * 
 * @author hukc
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/applicationContext-mallbasemanagement.xml" })
public class BaseTest {
	

	@Test
	public void init() {
		
		System.out.println("---------");
	}

}
