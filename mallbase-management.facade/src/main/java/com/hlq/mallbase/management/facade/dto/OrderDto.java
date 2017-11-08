package com.hlq.mallbase.management.facade.dto;

import java.io.Serializable;
/**
 * 
 * @时间:2017年11月2日
 * @作者: hukc
 * @Mail:hu1932@163.com
 * @说明:演示传输对象
 */
public class OrderDto implements Serializable {
	public String  orderId;
	private String createTime;
	private String channelId;
	private String orderName;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	
}
