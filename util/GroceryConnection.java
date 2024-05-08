package com.chainsys.util;

import com.chainsys.model.GroceryProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GroceryConnection extends GroceryProject {
	static Scanner sc = new Scanner(System.in);
	static GroceryProject gp = new GroceryProject();

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/g_app_project", "root",
				"Angelin#18");
		return connection;
	}

	public static void signUp(String userName, String password, String phoneNo, String mailId) {
		System.out.println("\t\t\t" + "              *REGISTRATION*");
		System.out.println("Enter the Username: " + "\n[Username must have upper case,lower case,and digits]");
		userName = sc.next();
		if (userName.matches("^[a-z A-Z 0-9]{6,}$")) {
			gp.setUserName(userName);
		} else {
			System.out.print("INVALID USERNAME\n");
			System.out.println("Enter the Username: " + "\n[Username must have upper case,lower case,and digits]");
			userName = sc.next();
		}
		System.out.println(
				"Enter the password: " + "\n[password must have upper case,lower case,special characters and digits]");
		password = sc.next();
		if (password.matches("^[a-z A-Z]{4,}[@#$%^&*][0-9]{2,}")) {
			gp.setPassword(password);
		} else {
			System.out.print("INVALID PASSWORD\n");
			System.out.println("Enter the password: "
					+ "\n[password must have upper case,lower case,special characters and digits]");
			password = sc.next();
		}
		System.out.println("Enter your phone number: ");
		phoneNo = sc.next();
		if (phoneNo.matches("^\\d{10}$")) {
			gp.setPhoneNo(phoneNo);
		} else {
			System.out.println("INVALID PHONE NUMBER\n");
			System.out.println("Enter your phone number: ");
			phoneNo = sc.next();
		}
		System.out.println("Enter your mail id: ");
		mailId = sc.next();
		if (mailId.matches("^(?=.*[0-9])[a-z0-9._%+-]+@[a-z]+.[a-z]{2,}$")) {
			gp.setMailId(mailId);
		} else {
			System.out.println("INVALID EMAIL\n");
			System.out.println("Enter your mail id: ");
			mailId = sc.next();
		}
	}

	public static void insertDetails(String userName, String password, String phoneNo, String mailId, String userName1,
			String password1, String phoneNo1, String mailId1) throws ClassNotFoundException, SQLException {
		System.out.println("\t\t\t" + "              *LOGIN*");
		System.out.println("Enter the Username: " + "\n[Username must have upper case,lower case,and digits]");
		userName1 = sc.next();
		System.out.println(
				"Enter the password: " + "\n[password must have upper case,lower case,special characters and digits]");
		password1 = sc.next();
		System.out.println("Enter your phone number: ");
		phoneNo1 = sc.next();
		System.out.println("Enter your mail id: ");
		mailId1 = sc.next();

		if (userName1.equals(userName) && password1.equals(password) && phoneNo1.equals(phoneNo)
				&& mailId1.equals(mailId)) {
			System.out.println("LOGIN SUCCESSFUL");
		} else {
			System.out.println("YOU DON'T HAvE AN ACCOUNT [REGISTER FIRST]\n");
			signUp(userName, password, phoneNo, mailId);
		}
		Connection connection = GroceryConnection.getConnection();
		String insert = "insert into groceryappproject(userName,password,phoneNo,mailId,userName1,password1,phoneNo1,mailId1) values (?,?,?,?,?,?,?,?)";
		PreparedStatement p = connection.prepareStatement(insert);
		Statement stmt = connection.createStatement();
		p.setString(1, userName);
		p.setString(2, password);
		p.setString(3, phoneNo);
		p.setString(4, mailId);
		p.setString(5, userName1);
		p.setString(6, password1);
		p.setString(7, phoneNo1);
		p.setString(8, mailId1);
		int rows = p.executeUpdate();
		System.out.println(rows + " rows inserted");
		stmt.close();
		p.close();
		connection.close();
	}

	public static void insertBusinessLogics(int priceTotal2, int sgst, int cgst, int totalAmount)
			throws ClassNotFoundException, SQLException {
		Connection connection = GroceryConnection.getConnection();
		String insert = "insert into businesslogic(price,sgst,cgst,totalAmount) values (?,?,?,?)";
		PreparedStatement p = connection.prepareStatement(insert);
		Statement stmt = connection.createStatement();
		p.setInt(1, priceTotal2);
		p.setInt(2, sgst);
		p.setInt(3, cgst);
		p.setInt(4, totalAmount);
		int rows = p.executeUpdate();
		System.out.println(rows + " rows inserted");
		stmt.close();
		p.close();
		connection.close();
	}

	public static void read(int priceTotal2, int sgst, int cgst, int totalAmount)
			throws ClassNotFoundException, SQLException {
		Connection connection = GroceryConnection.getConnection();
		String read = "select * from businesslogic where totalAmount='" + totalAmount + "'";
		PreparedStatement p = connection.prepareStatement(read);
		Statement stmt = connection.createStatement();
		ResultSet rows = stmt.executeQuery(read);
		while (rows.next()) {
			priceTotal2 = rows.getInt("price");
			sgst = rows.getInt("sgst");
			cgst = rows.getInt("cgst");
			totalAmount = rows.getInt("totalAmount");
		}
		System.out.println(
				"Price: " + priceTotal2 + "\nsgst: " + sgst + "\ncgst: " + cgst + "\nTotal Amount: " + totalAmount);
		System.out.println(rows + "rows retrived");
		stmt.close();
		p.close();
		connection.close();
	}
}
