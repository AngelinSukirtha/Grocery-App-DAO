package com.chainsys.dao;

import java.util.Scanner;
import com.chainsys.model.GroceryProject;
import com.chainsys.util.GroceryConnection;

public class admin {

	static Scanner sc = new Scanner(System.in);
	static GroceryProject gp = new GroceryProject();
	static GroceryConnection gc = new GroceryConnection();
	public static String adminId;
	public static String name;

	public static void adminSignUp(Scanner sc, GroceryProject gp, GroceryConnection gc) {

		while (true) {
			System.out.println("Enter the adminId");
			adminId = sc.next();
			if (adminId.matches("^\\d{10}$")) {
				GroceryProject.setadminId(adminId);
			} else {
				System.out.println("INVALID ID\n");
				System.out.println("Enter your Id: ");
				adminId = sc.next();
			}
			System.out.println("Enter your name");
			name = sc.next();
			if (name.matches("^[a-z A-Z]{1,}$")) {
				GroceryProject.setName(name);
			} else {
				System.out.print("INVALID USERNAME\n");
				System.out.println("Enter the name: ");
				name = sc.next();
			}
			break;
		}

	}

	public static void adminLogin(Scanner sc, String adminId, String name) {
		while (true) {
			System.out.println("Enter the adminId");
			adminId = sc.next();
			if (adminId.matches("^\\d{10}$")) {
				GroceryProject.setadminId(adminId);
			} else {
				System.out.println("INVALID ID\n");
				System.out.println("Enter your Id: ");
				adminId = sc.next();
			}
			System.out.println("Enter your name");
			name = sc.next();
			if (name.matches("^[a-z A-Z]{1,}$")) {
				GroceryProject.setName(name);
			} else {
				System.out.print("INVALID USERNAME\n");
				System.out.println("Enter the name: ");
				name = sc.next();
			}
			break;
		}
	}
}
