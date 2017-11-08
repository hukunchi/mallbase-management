package com.hlq.mallbase.management.facade.dto.page;

import java.io.Serializable;
/**
 * 
 * @时间:2017年11月2日
 * @作者: hukc
 * @Mail:hu1932@163.com
 * @说明:查询分页条件对象
 */
public class PageQueryDto  implements Serializable {
	private Integer limit=10;
	private Integer offset=0;
	private String orderByField;
	private String order;
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getOffset() {
		return offset;
	}
	public void setOffset(Integer offset) {
		this.offset = offset;
	}
	public String getOrderByField() {
		return orderByField;
	}
	public void setOrderByField(String orderByField) {
		this.orderByField = orderByField;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
}
