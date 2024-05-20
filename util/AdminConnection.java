package com.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.chainsys.model.GroceryProjectA;

public class AdminConnection {
	static Scanner sc = new Scanner(System.in);

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/g_app_project", "root",
				"Angelin#18");
		return connection;
	}

	public static void adminDelete() throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		String delete = "delete from groceryappproject where phoneNo=9087654321";
		PreparedStatement p = connection.prepareStatement(delete);
		p.executeUpdate();
		System.out.println("Successfully deleted!");
		p.close();
		connection.close();
	}

	public static void manageCategories(String fruits, String vegetables, String nuts, String stationery, String drinks,
			String grains) throws ClassNotFoundException, SQLException {
		System.out.println("Want to add more stocks? [y for yes (or) n for no]: ");
		char choice = sc.next().charAt(0);
		while (choice == 'y') {
			System.out.println("Enter the Fruit name: ");
			fruits = sc.next();
			System.out.println("Enter the Vegetable name: ");
			vegetables = sc.next();
			System.out.println("Enter the Nuts name: ");
			nuts = sc.next();
			System.out.println("Enter the Stationery name: ");
			stationery = sc.next();
			System.out.println("Enter the Drinks name: ");
			drinks = sc.next();
			System.out.println("Enter the Grains name: ");
			grains = sc.next();
			Connection connection = getConnection();
			String insert = "insert into adminManagement(fruits,vegetables,nuts,stationery,drinks,grains) values (?,?,?,?,?,?)";
			PreparedStatement p = connection.prepareStatement(insert);
			Statement stmt = connection.createStatement();
			p.setString(1, fruits);
			p.setString(2, vegetables);
			p.setString(3, nuts);
			p.setString(4, stationery);
			p.setString(5, drinks);
			p.setString(6, grains);
			int rows = p.executeUpdate();
			System.out.println(rows + " rows inserted");
			stmt.close();
			p.close();
			connection.close();
			readCategories(GroceryProjectA.fruits, GroceryProjectA.vegetables, GroceryProjectA.nuts,
					GroceryProjectA.stationery, GroceryProjectA.drinks, GroceryProjectA.grains);
			System.out.println("Want to add more stocks? [y for yes (or) n for no]: ");
			choice = sc.next().charAt(0);
		}
	}

	public static void readCategories(String fruits, String vegetables, String nuts, String stationery, String drinks,
			String grains) throws ClassNotFoundException, SQLException {
		System.out.println("\t\t" + "              *Available Stocks*\n");
		Connection connection = GroceryConnection.getConnection();
		String read = "select * from adminManagement";
		PreparedStatement p = connection.prepareStatement(read);
		ResultSet rows = p.executeQuery();
		ResultSetMetaData set = rows.getMetaData();
		System.out.println(
				"________________________________________________________________________________________________");
		System.out.println(" ");
		for (int i = 1; i <= set.getColumnCount(); i++) {
			System.out.printf("%-17s", set.getColumnName(i));
		}
		System.out.println(" ");
		System.out.println(
				"________________________________________________________________________________________________");
		System.out.println(" ");
		while (rows.next()) {
			for (int i = 1; i <= set.getColumnCount(); i++) {
				String value = rows.getString(i);
				System.out.printf("%-17s", value);
			}
			System.out.println();
		}
		System.out.println(
				"________________________________________________________________________________________________");
		System.out.println(" ");
		System.out.println(rows + "rows retrived");
		System.out.println(" ");
		p.close();
		connection.close();
		rows.close();
	}
}
