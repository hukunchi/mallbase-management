package com.hlq.mallbase.management.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.hlq.mallbase.management.dao.domain.Order;
import com.hlq.mallbase.management.facade.dto.OrderDto;

public interface OrderMapper extends BaseMapper<Order> {
	public List<OrderDto> pageQuery(@Param("page") Page<Order> page,@Param("orderName") String orderName);
}
