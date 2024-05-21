package com.chainsys.model;

public class GroceryProjectA {
	public static int ratings;
	public static String fruits;
	public static String vegetables;
	public static String nuts;
	public static String stationery;
	public static String drinks;
	public static String grains;
	public static int orderId;
	public static String cardNumber;
	public static String expirationDate;
	public static String paymentMode;

	public GroceryProjectA(String paymentMode) {
		super();
		GroceryProjectA.paymentMode = paymentMode;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		GroceryProjectA.paymentMode = paymentMode;
	}

	public GroceryProjectA(int orderId, String cardNumber, String expirationDate) {
		super();
		GroceryProjectA.orderId = orderId;
		GroceryProjectA.cardNumber = cardNumber;
		GroceryProjectA.expirationDate = expirationDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		GroceryProjectA.orderId = orderId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		GroceryProjectA.cardNumber = cardNumber;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		GroceryProjectA.expirationDate = expirationDate;
	}

	public GroceryProjectA(String fruits, String vegetables, String nuts, String stationery, String drinks,
			String grains) {
		super();
		GroceryProjectA.fruits = fruits;
		GroceryProjectA.vegetables = vegetables;
		GroceryProjectA.nuts = nuts;
		GroceryProjectA.stationery = stationery;
		GroceryProjectA.drinks = drinks;
		GroceryProjectA.grains = grains;
	}

	public static String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		GroceryProjectA.fruits = fruits;
	}

	public static String getVegetables() {
		return vegetables;
	}

	public void setVegetables(String vegetables) {
		GroceryProjectA.vegetables = vegetables;
	}

	public static String getNuts() {
		return nuts;
	}

	public void setNuts(String nuts) {
		GroceryProjectA.nuts = nuts;
	}

	public static String getStationery() {
		return stationery;
	}

	public void setStationery(String stationery) {
		GroceryProjectA.stationery = stationery;
	}

	public static String getDrinks() {
		return drinks;
	}

	public void setDrinks(String drinks) {
		GroceryProjectA.drinks = drinks;
	}

	public static String getGrains() {
		return grains;
	}

	public void setGrains(String grains) {
		GroceryProjectA.grains = grains;
	}

	public GroceryProjectA(int ratings) {
		super();
		GroceryProjectA.ratings = ratings;
	}

	@Override
	public String toString() {
		return "GroceryProjectA [paymentMode=" + paymentMode + ", getPaymentMode()=" + getPaymentMode()
				+ ", getOrderId()=" + getOrderId() + ", getCardNumber()=" + getCardNumber() + ", getExpirationDate()="
				+ getExpirationDate() + "]";
	}

	public static int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		GroceryProjectA.ratings = ratings;
	}

}
