package com.chainsys.model;

import java.util.Scanner;

public class GroceryProject {
	Scanner sc = new Scanner(System.in);
	public int price;
	public String category;
	public int quantity;
	public int discount;
	public int priceTotal;
	public int priceTotal1;
	public int totalPrice;
	public static String userName;
	public static String password;
	public static String phoneNo;
	public static String mailId;
	public static String userName1;
	public static String password1;
	public static String phoneNo1;
	public static String mailId1;
	public static int priceTotal2;
	public static int sgst;
	public static int cgst;
	public static int totalAmount;
	public static String adminId;
	public static String name;

	public GroceryProject(String adminId, String name) {
		super();
		GroceryProject.adminId = adminId;
		GroceryProject.name = name;
	}

	public static String getadminId() {
		return adminId;
	}

	public static void setadminId(String adminId) {
		GroceryProject.adminId = adminId;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		GroceryProject.name = name;
	}

	public static String getUserName1() {
		return userName1;
	}

	public static void setUserName1(String userName1) {
		GroceryProject.userName1 = userName1;
	}

	public static String getPassword1() {
		return password1;
	}

	public static void setPassword1(String password1) {
		GroceryProject.password1 = password1;
	}

	public static String getPhoneNo1() {
		return phoneNo1;
	}

	public static void setPhoneNo1(String phoneNo1) {
		GroceryProject.phoneNo1 = phoneNo1;
	}

	public static String getMailId1() {
		return mailId1;
	}

	public static void setMailId1(String mailId1) {
		GroceryProject.mailId1 = mailId1;
	}

	public GroceryProject(String mailId) {
		GroceryProject.mailId = mailId;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		GroceryProject.mailId = mailId;
	}

	public GroceryProject(int sgst, int cgst, int totalAmount) {
		GroceryProject.sgst = sgst;
		GroceryProject.cgst = cgst;
		GroceryProject.totalAmount = totalAmount;
	}

	public GroceryProject() {
	}

	public int getSgst() {
		return sgst;
	}

	public void setSgst(int sgst) {
		GroceryProject.sgst = sgst;
	}

	public int getCgst() {
		return cgst;
	}

	public void setCgst(int cgst) {
		GroceryProject.cgst = cgst;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		GroceryProject.totalAmount = totalAmount;
	}

	public void GroceryApp(String phoneNo) {
		GroceryProject.phoneNo = phoneNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		GroceryProject.phoneNo = phoneNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		GroceryProject.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		GroceryProject.password = password;
	}

	public void GroceryApp(int priceTotal, int priceTotal2, int totalPrice, int priceTotal1) {
		this.priceTotal = priceTotal;
		GroceryProject.priceTotal2 = priceTotal2;
		this.totalPrice = totalPrice;
		this.priceTotal1 = priceTotal1;
	}

	public double getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(int priceTotal) {
		this.priceTotal = priceTotal;
	}

	public double getPriceTotal2() {
		return priceTotal2;
	}

	public void setPriceTotal2(int priceTotal2) {
		GroceryProject.priceTotal2 = priceTotal2;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getPriceTotal1() {
		return priceTotal1;
	}

	public void setPriceTotal1(int priceTotal1) {
		this.priceTotal1 = priceTotal1;
	}

	public void GroceryApp1(int discount) {

		this.discount = discount;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
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
		return "GroceryProject [adminId=" + adminId + ", name=" + name + ", getMailId()=" + getMailId() + ", getSgst()="
				+ getSgst() + ", getCgst()=" + getCgst() + ", getTotalAmount()=" + getTotalAmount() + ", getPhoneNo()="
				+ getPhoneNo() + ", getUserName()=" + getUserName() + ", getPassword()=" + getPassword()
				+ ", getPriceTotal()=" + getPriceTotal() + ", getPriceTotal2()=" + getPriceTotal2()
				+ ", getTotalPrice()=" + getTotalPrice() + ", getPriceTotal1()=" + getPriceTotal1() + ", getDiscount()="
				+ getDiscount() + ", getQuantity()=" + getQuantity() + ", getPrice()=" + getPrice() + ", getCategory()="
				+ getCategory() + "]";
	}

	public void GroceryApp(int price, String category) {
		this.price = price;
		this.category = category;
	}

}