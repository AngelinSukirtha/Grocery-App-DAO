package com.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//import com.chainsys.model.GroceryProjectA;

public class CustomerConnection {
	public static Scanner sc = new Scanner(System.in);

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/g_app_project", "root",
				"Angelin#18");
		return connection;
	}

	public static void ratingsSystem(int totalAmount, int ratings) throws ClassNotFoundException, SQLException {
		Connection connection = CustomerConnection.getConnection();
		String update = "update businesslogic set  ratings=? where totalAmount=" + totalAmount;
		PreparedStatement p = connection.prepareStatement(update);
		p.setInt(1, ratings);
		int rows = p.executeUpdate();
		System.out.println(rows + " Rows affected");
		p.close();
		connection.close();
	}

	public static void insertPaymentDetails(String paymentMode, int orderId, String cardNumber, String expirationDate)
			throws ClassNotFoundException {
		System.out.println("\t\t" + "              *PAYMENT DETAILS*");
		System.out.println("Select your payment mode [Online/Offline]");
		paymentMode = sc.next();
		if (paymentMode.equals("Offline")) {
			System.out.println("Your payment mode is " + paymentMode);
		} else {
			System.out.println("Your payment mode is " + paymentMode);
			System.out.println("Enter your cardNumber: ");
			cardNumber = sc.next();
			System.out.println("Enter your card expirationDate: ");
			expirationDate = sc.next();
		}
		try {
			Connection connection = getConnection();
			String insert = "insert into payment(orderId,paymentMode, cardNumber, expirationDate) values (?, ?, ?, ?)";
			PreparedStatement p = connection.prepareStatement(insert);
			p.setInt(1, orderId);
			p.setString(2, paymentMode);
			p.setString(3, cardNumber);
			p.setString(4, expirationDate);
			int rows = p.executeUpdate();
			System.out.println(rows + " Rows affected");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
