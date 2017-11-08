package com.hlq.mallbase.management.facade.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.plugins.Page;
import com.hlq.mallbase.management.dao.domain.Order;
import com.hlq.mallbase.management.dao.mapper.OrderMapper;
import com.hlq.mallbase.management.facade.dto.OrderDto;
import com.hlq.mallbase.management.facade.dto.page.PageQueryDto;
import com.hlq.mallbase.management.facade.dto.page.PageResultDto;
import com.hlq.mallbase.management.facade.intf.DemoFacade;
import com.hlq.mallbase.management.factory.PageFactory;

public class DemoFacadeImpl implements DemoFacade {
	@Autowired
	OrderMapper orderMapper;
	
	@Override
	public PageResultDto<OrderDto> demoOrderQuery(PageQueryDto query,String userName) {
		PageResultDto<OrderDto> res= new PageResultDto<OrderDto>();
		System.out.println("调用demoQueryName成功："+userName);
		Page<Order> page =new PageFactory<Order>().defaultPage(query);
		List<OrderDto> list = orderMapper.pageQuery(page, userName);
		res.setRows(list);
		res.setTotal(page.getTotal());
		res.setCurrent(page.getCurrent());
		res.setPages(page.getPages());
		res.setSize(page.getSize());
		return res;
	}
	
	@Override
	public OrderDto insertOrder(OrderDto dto) {
		Order order =new Order();
		order.setOrderId(dto.getOrderId());
		order.setOrderName(dto.getOrderName());
		order.setCreateTime(new Date());
		order.setChannelId(dto.getChannelId());
		// TODO Auto-generated method stub
		orderMapper.insert(order);
		return dto;
	}
}
