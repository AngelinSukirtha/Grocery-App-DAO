package com.chainsys.test;

import java.sql.SQLException;
import java.util.Scanner;
import com.chainsys.dao.*;
import com.chainsys.model.GroceryProjectA;
import com.chainsys.util.*;

public class TestGroceryApp extends GroceryConnection {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		while (true) {
			System.out.println("Are you an Admin or User[1 or 2]" + "\n1.Admin" + "\n2.User");
			int entry = sc.nextInt();
			switch (entry) {
			case 1:
				GroceryConnection.adminSide(userName1, password1);
				System.out.println(" ");
				AdminConnection.readCategories(GroceryProjectA.fruits, GroceryProjectA.vegetables, GroceryProjectA.nuts,
						GroceryProjectA.stationery, GroceryProjectA.drinks, GroceryProjectA.grains);
				AdminConnection.manageCategories(GroceryProjectA.fruits, GroceryProjectA.vegetables,
						GroceryProjectA.nuts, GroceryProjectA.stationery, GroceryProjectA.drinks,
						GroceryProjectA.grains);
				AdminConnection.adminDelete();
				break;
			case 2:
				GroceryConnection.signUp(userName, password, phoneNo, mailId);
				GroceryConnection.insertDetails(userName, password, phoneNo, mailId, userName1, password1, phoneNo1,
						mailId1);

				System.out.println(
						"-------------------------------------------------------------------------------------------------");

				System.out.println("\t\t" + "              WELCOME TO THE GROCER'S CHOICE");
				System.out.println(" ");
				System.out.println("Address:3/98 Anna Nagar,Chennai" + "\t\t\t\t\t\t" + "Contact:9443576543");
				System.out.println("Opposite to KFC" + "\t\t\t\t\t\t\t\t" + "GSTIN: 00AWBPP1234K123");
				Grocery app = new Grocery();
				app.categoryDetails();
				app.quantityDetails();
				app.moreItems();
				System.out.println(
						"-------------------------------------------------------------------------------------------------");
				app.discount();
				app.totalAmount();
				GroceryConnection.insertBusinessLogics(priceTotal2, sgst, cgst, totalAmount);
				System.out.println(" ");
				Customer.ratings();
				System.out.println(" ");
				CustomerConnection.ratingsSystem(totalAmount, GroceryProjectA.ratings);
				System.out.println(" ");
				GroceryConnection.read(priceTotal2, sgst, cgst, totalAmount);
				System.out.println(" ");
				System.out.println("\t\t" + "              THANK YOU!! COME AGAIN");
				break;
			default:
				System.out.println("INVALID");
			}
			break;
		}
	}
}