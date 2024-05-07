package com.chainsys.model;

import java.util.Scanner;

public class GroceryProject {
	Scanner sc = new Scanner(System.in);
	public String name;
	public double price;
	public String category;
	public int quantity;
	public double discount;
	public double priceTotal;
	public double priceTotal2;
	public double totalPrice;
	public double priceTotal1;
	public String userName;
	public static String password;
	public static String phoneNo;
	public String mailId;

	public GroceryProject() {
		this.mailId = mailId;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public void GroceryApp(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void GroceryApp(double priceTotal, Object p, double priceTotal2, double totalPrice, double priceTotal1) {
		this.priceTotal = priceTotal;
		this.priceTotal2 = priceTotal2;
		this.totalPrice = totalPrice;
		this.priceTotal1 = priceTotal1;
	}

	public double getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(double priceTotal) {
		this.priceTotal = priceTotal;
	}

	public double getPriceTotal2() {
		return priceTotal2;
	}

	public void setPriceTotal2(double priceTotal2) {
		this.priceTotal2 = priceTotal2;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getPriceTotal1() {
		return priceTotal1;
	}

	public void setPriceTotal1(double priceTotal1) {
		this.priceTotal1 = priceTotal1;
	}

	public void GroceryApp() {

		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public void GroceryApp(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "GroceryProject [mailId=" + mailId + ", getMailId()=" + getMailId() + ", getPhoneNo()=" + getPhoneNo()
				+ ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword() + ", getPriceTotal()="
				+ getPriceTotal() + ", getPriceTotal2()=" + getPriceTotal2() + ", getTotalPrice()=" + getTotalPrice()
				+ ", getPriceTotal1()=" + getPriceTotal1() + ", getDiscount()=" + getDiscount() + ", getQuantity()="
				+ getQuantity() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getCategory()="
				+ getCategory() + "]";
	}

	public void GroceryApp(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

}
