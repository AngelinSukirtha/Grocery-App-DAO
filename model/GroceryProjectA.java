package com.chainsys.model;

public class GroceryProjectA {
	public static int ratings;
	public static String fruits;
	public static String vegetables;
	public static String nuts;
	public static String stationery;
	public static String drinks;
	public static String grains;

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
		return "GroceryProjectA [fruits=" + fruits + ", vegetables=" + vegetables + ", nuts=" + nuts + ", stationery="
				+ stationery + ", drinks=" + drinks + ", grains=" + grains + ", getFruits()=" + getFruits()
				+ ", getVegetables()=" + getVegetables() + ", getNuts()=" + getNuts() + ", getStationery()="
				+ getStationery() + ", getDrinks()=" + getDrinks() + ", getGrains()=" + getGrains() + ", getRatings()="
				+ getRatings() + "]";
	}

	public static int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		GroceryProjectA.ratings = ratings;
	}

}
