package com.brightChamps.marketPlace.entity;

import java.util.List;

public class OrderInput {

	private String emailId;
	private Double orderAmount;
	private List<OrderProductQuantity> orderProductQuantityList;
	
	
	
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public List<OrderProductQuantity> getOrderProductQuantityList() {
		return orderProductQuantityList;
	}
	public void setOrderProductQuantityList(List<OrderProductQuantity> orderProductQuantityList) {
		this.orderProductQuantityList = orderProductQuantityList;
	}
	
	
	
	
}
