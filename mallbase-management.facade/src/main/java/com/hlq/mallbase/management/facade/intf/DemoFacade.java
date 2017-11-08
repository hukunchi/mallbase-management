package com.hlq.mallbase.management.facade.intf;

import com.hlq.mallbase.management.facade.dto.OrderDto;
import com.hlq.mallbase.management.facade.dto.page.PageQueryDto;
import com.hlq.mallbase.management.facade.dto.page.PageResultDto;

public interface DemoFacade {
	
	public PageResultDto<OrderDto> demoOrderQuery(PageQueryDto query,String userName);
	
	public OrderDto insertOrder(OrderDto dto);
}
