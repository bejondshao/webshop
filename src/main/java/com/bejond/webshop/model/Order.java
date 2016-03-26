package com.bejond.webshop.model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

/**
 * Created by bejond on 3/24/16.
 */

@Component
@Entity (name = "Order_")
public class Order {
	private long orderId;
	private User user;
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

	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "userId")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
