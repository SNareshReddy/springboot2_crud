package com.infymart.order.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

@Id
@GeneratedValue
int order_id;
String order_due;
String product_name;
Long price;
int product_id;
int user_id;

public Order() {}

public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public String getOrder_due() {
	return order_due;
}
public void setOrder_due(String order_due) {
	this.order_due = order_due;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public Long getPrice() {
	return price;
}
public void setPrice(Long price) {
	this.price = price;
}
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}

@Override
public String toString() {
	return "Order [order_id=" + order_id + ", order_due=" + order_due + ", product_name=" + product_name + ", price="
			+ price + ", product_id=" + product_id + ", user_id=" + user_id + "]";
}

}
