package com.chainsys.model;

public class GroceryProject {
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
	public static String userName2;
	public static String password2;
	 
	 public GroceryProject(int price, String category, int quantity, int discount, int priceTotal, int priceTotal1,
			int totalPrice, String userName, String password, String phoneNo, String mailId, String userName1,
			String password1, String phoneNo1, String mailId1, int priceTotal2, int sgst, int cgst, int totalAmount,
			String userName2, String password2) {
		super();
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.discount = discount;
		this.priceTotal = priceTotal;
		this.priceTotal1 = priceTotal1;
		this.totalPrice = totalPrice;
		GroceryProject.userName = userName;
		GroceryProject.password = password;
		GroceryProject.phoneNo = phoneNo;
		GroceryProject.mailId = mailId;
		GroceryProject.userName1 = userName1;
		GroceryProject.password1 = password1;
		GroceryProject.phoneNo1 = phoneNo1;
		GroceryProject.mailId1 = mailId1;
		GroceryProject.priceTotal2 = priceTotal2;
		GroceryProject.sgst = sgst;
		GroceryProject.cgst = cgst;
		GroceryProject.totalAmount = totalAmount;
		GroceryProject.userName2 = userName2;
		GroceryProject.password2 = password2;
	}
	

	public GroceryProject() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "GroceryProject [price=" + price + ", category=" + category + ", quantity=" + quantity + ", discount="
				+ discount + ", priceTotal=" + priceTotal + ", priceTotal1=" + priceTotal1 + ", totalPrice="
				+ totalPrice + ", userName=" + userName + ", password=" + password + ", phoneNo=" + phoneNo
				+ ", mailId=" + mailId + ", userName1=" + userName1 + ", password1=" + password1 + ", phoneNo1="
				+ phoneNo1 + ", mailId1=" + mailId1 + ", priceTotal2=" + priceTotal2 + ", sgst=" + sgst + ", cgst="
				+ cgst + ", totalAmount=" + totalAmount + ", userName2=" + userName2 + ", password2=" + password2
				+ ", getPrice()=" + getPrice() + ", getCategory()=" + getCategory() + ", getQuantity()=" + getQuantity()
				+ ", getDiscount()=" + getDiscount() + ", getPriceTotal()=" + getPriceTotal() + ", getPriceTotal1()="
				+ getPriceTotal1() + ", getTotalPrice()=" + getTotalPrice() + "]";
	}
	
	public int getPrice() {
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getPriceTotal() {
		return priceTotal;
	}
	public void setPriceTotal(int priceTotal) {
		this.priceTotal = priceTotal;
	}
	public int getPriceTotal1() {
		return priceTotal1;
	}
	public void setPriceTotal1(int priceTotal1) {
		this.priceTotal1 = priceTotal1;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public static String getUserName() {
		return userName;
	}
	public static void setUserName(String userName) {
		GroceryProject.userName = userName;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		GroceryProject.password = password;
	}
	public static String getPhoneNo() {
		return phoneNo;
	}
	public static void setPhoneNo(String phoneNo) {
		GroceryProject.phoneNo = phoneNo;
	}
	public static String getMailId() {
		return mailId;
	}
	public static void setMailId(String mailId) {
		GroceryProject.mailId = mailId;
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
	public static int getPriceTotal2() {
		return priceTotal2;
	}
	public static void setPriceTotal2(int priceTotal2) {
		GroceryProject.priceTotal2 = priceTotal2;
	}
	public static int getSgst() {
		return sgst;
	}
	public static void setSgst(int sgst) {
		GroceryProject.sgst = sgst;
	}
	public static int getCgst() {
		return cgst;
	}
	public static void setCgst(int cgst) {
		GroceryProject.cgst = cgst;
	}
	public static int getTotalAmount() {
		return totalAmount;
	}
	public static void setTotalAmount(int totalAmount) {
		GroceryProject.totalAmount = totalAmount;
	}
	public static String getUserName2() {
		return userName2;
	}
	public static void setUserName2(String userName2) {
		GroceryProject.userName2 = userName2;
	}
	public static String getPassword2() {
		return password2;
	}
	public static void setPassword2(String password2) {
		GroceryProject.password2 = password2;
	}
	
}
	
	