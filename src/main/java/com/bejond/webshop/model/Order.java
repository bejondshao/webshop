package com.bejond.webshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by bejond on 3/24/16.
 */

@Entity (name = "Order_")
public class Order {
	private long orderId;
	private long userId;
	private String items;
	private long itemsTotal;
	private long discountTotal;
	private long shippingFee;
	private long total;
	private Date createDate;
	private Date modifiedDate;
	private int status;

	@Id
	@GeneratedValue
	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public long getItemsTotal() {
		return itemsTotal;
	}

	public void setItemsTotal(long itemsTotal) {
		this.itemsTotal = itemsTotal;
	}

	public long getDiscountTotal() {
		return discountTotal;
	}

	public void setDiscountTotal(long discountTotal) {
		this.discountTotal = discountTotal;
	}

	public long getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(long shippingFee) {
		this.shippingFee = shippingFee;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
}
