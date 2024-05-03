package com.chainsys.test;

import java.sql.SQLException;
import java.util.Scanner;
import com.chainsys.dao.AppLogin;
import com.chainsys.dao.Grocery;

public class TestGroceryApp {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("\t\t\t" + "              LOGIN");
		AppLogin app1 = new AppLogin();
		app1.userName();
		app1.password();
		app1.phoneNo();
		app1.mailId();
		AppLogin.addData();
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
		System.out.println(" ");
		System.out.println("\t\t" + "              THANK YOU!! COME AGAIN");
	}
}