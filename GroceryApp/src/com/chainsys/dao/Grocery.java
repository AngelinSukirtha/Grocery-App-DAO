package com.chainsys.dao;

import java.util.Scanner;
import com.chainsys.model.GroceryProject;

public class Grocery extends Items implements GroceryApp {

	Scanner sc = new Scanner(System.in);
	GroceryProject ga = new GroceryProject();

	public void categoryDetails() {
		System.out.println(" ");
		System.out.println("IN GROCER'S CHOICE WE HAVE" + "\n1.Fruits" + "\n2.Vegetables" + "\n3.Nuts"
				+ "\n4.Stationery" + "\n5.Drinks" + "\n6.Grains");
		System.out.println("CHOOSE YOUR CATEGORY FROM ABOVE");
		String categoryInput = sc.nextLine();

		switch (categoryInput) {
		case "Fruits":
			System.out.println(" ");
			System.out.println("AVAILABLE ITEMS");
			System.out.println(
					"1.Apple" + "\n2.Orange" + "\n3.Grapes" + "\n4.Banana" + "\n5.Watermelon" + "\n6.PineApple");
			itemInput();
			break;

		case "Vegetables":
			System.out.println(" ");
			System.out.println("AVAILABLE ITEMS");
			System.out
					.println("1.Potato" + "\n2.Tomato" + "\n3.Onion" + "\n4.Carrot" + "\n5.Beetroot" + "\n6.Broccoli");
			itemInput1();
			break;

		case "Nuts":
			System.out.println(" ");
			System.out.println("AVAILABLE ITEMS");
			System.out.println(
					"1.Almonds" + "\n2.Walnuts" + "\n3.Pecans" + "\n4.Cashews" + "\n5.Hazelnuts" + "\n6.Peanuts");
			itemInput2();
			break;

		case "Stationery":
			System.out.println("AVAILABLE ITEMS");
			System.out.println("1.Notebooks" + "\n2.Diaries" + "\n3.Pen" + "\n4.Pencils" + "\n5.Calculator"
					+ "\n6.Punching Machine");
			itemInput3();
			break;

		case "Drinks":
			System.out.println(" ");
			System.out.println("AVAILABLE ITEMS");
			System.out
					.println("1.Coca-Cola" + "\n2.Pepsi" + "\n3.Limca" + "\n4.Sprite" + "\n5.Fanta" + "\n6.Appy Fizz");
			itemInput4();
			break;

		case "Grains":
			System.out.println(" ");
			System.out.println("AVAILABLE ITEMS");
			System.out.println(
					"1.Wheat" + "\n2.Oats" + "\n3.Rice" + "\n4.Corn" + "\n5.Barley" + "\n6.Sorghum" + "\n7.Millet");
			itemInput5();
			break;

		default:
			System.out.println(" ");
			System.out.println("NOT AVAILABLE");
			System.out.println("ENTER THE VALID CATEGORY[Type exactly how it shows]");
			categoryDetails();
			break;
		}
	}

	public void itemInput5() {
		System.out.println("ENTER THE ITEM YOU WANT:");
		String itemInput5 = sc.nextLine();

		switch (itemInput5) {
		case "Wheat":
			System.out.println("You chose wheat from the Grains category.");
			ga.price = 50;
			System.out.println("Price is " + ga.price);
			break;
		case "Oats":
			System.out.println("You chose oats from the Grains category.");
			ga.price = 50;
			System.out.println("Price is " + ga.price);
			break;
		case "Rice":
			System.out.println("You chose rice from the Grains category.");
			ga.price = 60;
			System.out.println("Price is " + ga.price);
			break;
		case "Corn":
			System.out.println("You chose corn from the Grains category.");
			ga.price = 20;
			System.out.println("Price is " + ga.price);
			break;
		case "Barley":
			System.out.println("You chose barley from the Grains category.");
			ga.price = 30;
			System.out.println("Price is " + ga.price);
			break;
		case "Sorghum":
			System.out.println("You chose sorghum from the Grains category.");
			ga.price = 30;
			System.out.println("Price is " + ga.price);
			break;
		case "Millet":
			System.out.println("You chose millet from the Grains category.");
			ga.price = 25;
			System.out.println("Price is " + ga.price);
			break;
		default:
			System.out.println("INVALID INPUT");
			System.out.println("ENTER THE VALID INPUT[Type exactly how it shows]");
			itemInput5();
			break;
		}
	}

	public void itemInput4() {
		System.out.println("ENTER THE ITEM YOU WANT:");
		String itemInput4 = sc.nextLine();

		switch (itemInput4) {
		case "Coca-Cola":
			System.out.println("You chose Coca-Cola from the Drinks category.");
			ga.price = 25;
			System.out.println("Price is " + ga.price);
			break;
		case "Pepsi":
			System.out.println("You chose Pepsi from the Drinks category.");
			ga.price = 30;
			System.out.println("Price is " + ga.price);
			break;
		case "Limca":
			System.out.println("You chose Limca from the Drinks category.");
			ga.price = 15;
			System.out.println("Price is " + ga.price);
			break;
		case "Sprite":
			System.out.println("You chose Sprite from the Drinks category.");
			ga.price = 35;
			System.out.println("Price is " + ga.price);
			break;
		case "Fanta":
			System.out.println("You chose Fanta from the Drinks category.");
			ga.price = 25;
			System.out.println("Price is " + ga.price);
			break;
		case "Appy Fizz":
			System.out.println("You chose Appy Fizz from the Drinks category.");
			ga.price = 30;
			System.out.println("Price is " + ga.price);
			break;
		default:
			System.out.println("INVALID INPUT");
			System.out.println("ENTER THE VALID INPUT[Type exactly how it shows]");
			itemInput4();
			break;
		}
	}

	public void itemInput3() {
		System.out.println("ENTER THE ITEM YOU WANT:");
		String itemInput3 = sc.nextLine();

		switch (itemInput3) {
		case "Notebooks":
			System.out.println("You chose notebooks from the Stationery category.");
			ga.price = 50;
			System.out.println("Price is " + ga.price);
			break;
		case "Diaries":
			System.out.println("You chose diaries from the Stationery category.");
			ga.price = 200;
			System.out.println("Price is " + ga.price);
			break;
		case "Pen":
			System.out.println("You chose pen from the Stationery category.");
			ga.price = 20;
			System.out.println("Price is " + ga.price);
			break;
		case "Pencils":
			System.out.println("You chose pencils from the Stationery category.");
			ga.price = 5;
			System.out.println("Price is " + ga.price);
			break;
		case "Calculator":
			System.out.println("You chose calculator from the Stationery category.");
			ga.price = 500;
			System.out.println("Price is " + ga.price);
			break;
		case "Punching Machine":
			System.out.println("You chose punching machine from the Stationery category.");
			ga.price = 600;
			System.out.println("Price is " + ga.price);
			break;
		default:
			System.out.println("INVALID INPUT");
			System.out.println("ENTER THE VALID INPUT[Type exactly how it shows]");
			itemInput3();
			break;
		}
	}

	public void itemInput2() {
		System.out.println("ENTER THE ITEM YOU WANT:");
		String itemInput2 = sc.nextLine();

		switch (itemInput2) {
		case "Almonds":
			System.out.println("You chose almonds from the Nuts category.");
			ga.price = 4;
			System.out.println("Price is " + ga.price);
			break;
		case "Walnuts":
			System.out.println("You chose walnuts from the Nuts category.");
			ga.price = 5;
			System.out.println("Price is " + ga.price);
			break;
		case "Pecans":
			System.out.println("You chose pecans from the Nuts category.");
			ga.price = 3;
			System.out.println("Price is " + ga.price);
			break;
		case "Cashews":
			System.out.println("You chose cashews from the Nuts category.");
			ga.price = 8;
			System.out.println("Price is " + ga.price);
			break;
		case "Hazelnuts":
			System.out.println("You chose hazelnut from the Nuts category.");
			ga.price = 10;
			System.out.println("Price is " + ga.price);
			break;
		case "Peanuts":
			System.out.println("You chose peanuts from the Nuts category.");
			ga.price = 3;
			System.out.println("Price is " + ga.price);
			break;
		default:
			System.out.println("INVALID INPUT");
			System.out.println("ENTER THE VALID INPUT[Type exactly how it shows]");
			itemInput2();
			break;
		}
	}

	public void itemInput1() {
		System.out.println("ENTER THE ITEM YOU WANT:");
		String itemInput1 = sc.nextLine();

		switch (itemInput1) {
		case "Potato":
			System.out.println("You chose potato from the Vegetables category.");
			ga.price = 10;
			System.out.println("Price is " + ga.price);
			break;
		case "Tomato":
			System.out.println("You chose tomato from the Vegetables category.");
			ga.price = 5;
			System.out.println("Price is " + ga.price);
			break;
		case "Onion":
			System.out.println("You chose onion from the Vegetables category.");
			ga.price = 6;
			System.out.println("Price is " + ga.price);
			break;
		case "Carrot":
			System.out.println("You chose carrot from the Vegetables category.");
			ga.price = 8;
			System.out.println("Price is " + ga.price);
			break;
		case "Beetroot":
			System.out.println("You chose beetroot from the Vegetables category.");
			ga.price = 10;
			System.out.println("Price is " + ga.price);
			break;
		case "Broccoli":
			System.out.println("You chose broccoli from the Vegetables category.");
			ga.price = 12;
			System.out.println("Price is " + ga.price);
			break;
		default:
			System.out.println("INVALID INPUT");
			System.out.println("ENTER THE VALID INPUT[Type exactly how it shows]");
			itemInput1();
			break;
		}
	}

	public void itemInput() {
		System.out.println("ENTER THE ITEM YOU WANT:");
		String itemInput = sc.nextLine();

		switch (itemInput) {
		case "Apple":
			System.out.println("You chose Apple from the Fruits category.");
			ga.price = 10;
			System.out.println("Price is " + ga.price);

			break;
		case "Orange":
			System.out.println("You chose orange from the Fruits category.");
			ga.price = 12;
			System.out.println("Price is " + ga.price);
			break;
		case "Grapes":
			System.out.println("You chose grapes from the Fruits category.");
			ga.price = 15;
			System.out.println("Price is " + ga.price);
			break;
		case "Banana":
			System.out.println("You chose banana from the Fruits category.");
			ga.price = 6;
			System.out.println("Price is " + ga.price);
			break;
		case "Watermelon":
			System.out.println("You chose Watermelon from the Fruits category.");
			ga.price = 30;
			System.out.println("Price is " + ga.price);
			break;
		case "PineApple":
			System.out.println("You chose pineapple from the Fruits category.");
			ga.price = 40;
			System.out.println("Price is " + ga.price);
			break;
		default:
			System.out.println("INVALID INPUT");
			System.out.println("ENTER THE VALID INPUT[Type exactly how it shows]");
			itemInput();
			break;
		}
	}

	public void quantityDetails() {
		System.out.println(" ");
		System.out.println("ENTER THE QUANTITY");
		GroceryProject.quantity = sc.nextInt();
		while (true) {
			if (GroceryProject.quantity > 0) {
				ga.priceTotal = (int) (ga.priceTotal + (ga.quantity * ga.price));
				System.out.println("Your price amount is " + ga.priceTotal);
			} else {
				System.out.println("ENTER THE VALID DATA:");
				ga.quantity = sc.nextInt();
			}
			break;
		}

	}

	public void moreItems() {
		System.out.println("Want to add more items? [y for yes (or) n for no]: ");
		char choice = sc.next().charAt(0);
		while (choice == 'y') {
			categoryDetails();
			quantityDetails();
			System.out.println("Want to add more items? [y for yes (or) n for no]: ");
			choice = sc.next().charAt(0);
		}
	}

	public int discount() {
		if (ga.priceTotal > 0) {
			if (ga.priceTotal > 1000) {
				ga.discount = (int) (0.1 * ga.priceTotal);
				ga.priceTotal2 = ga.priceTotal - ga.discount;
				System.out.println("Congradulations! you get 10% discount");
				System.out.println("Your price amount with discount is " + ga.priceTotal2);
			} else if (ga.priceTotal > 5000) {
				ga.discount = (int) (0.3 * ga.priceTotal);
				ga.priceTotal2 = ga.priceTotal - ga.discount;
				System.out.println("Congradulations! you get 30% discount");
				System.out.println("Your price amount with discount is " + ga.priceTotal2);
			} else if (ga.priceTotal > 10000) {
				ga.discount = (int) (0.9 * ga.priceTotal);
				ga.priceTotal2 = ga.priceTotal - ga.discount;
				System.out.println("Congradulations! you get 90% discount");
				System.out.println("Your price amount with discount is " + ga.priceTotal2);
			} else {
				ga.priceTotal2 = ga.priceTotal - ga.discount;
				System.out.println("NO DISCOUNT!!");
			}
		}
		System.out.println("\t\t\t\t\t\t\t\t" + "     " + "Final price: " + ga.priceTotal2);
		return ga.priceTotal2;
	}

	public void totalAmount() {
		ga.sgst = ga.priceTotal2 * 12 / 100;
		System.out.println("\t\t\t\t\t\t\t\t\t" + "SGST (%): " + ga.sgst);
		ga.cgst = ga.priceTotal2 * 12 / 100;
		System.out.println("\t\t\t\t\t\t\t\t\t" + "CGST (%): " + ga.cgst);
		ga.totalAmount = ga.priceTotal2 + ga.cgst + ga.sgst;
		System.out.println("\t\t\t\t\t\t\t\t" + "    " + "Total Amount: " + ga.totalAmount);
	}
}
