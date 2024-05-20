package com.chainsys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerConnection {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/g_app_project", "root",
				"Angelin#18");
		return connection;
	}

	public static void ratingsSystem( int totalAmount, int ratings)
			throws ClassNotFoundException, SQLException {
		Connection connection = CustomerConnection.getConnection();
		String update = "update businesslogic set  ratings=? where totalAmount="+totalAmount;
		PreparedStatement p = connection.prepareStatement(update);
		p.setInt(1, ratings);
		int rows = p.executeUpdate();
		System.out.println(rows +" Rows affected");
		p.close();
		connection.close();
	}

}
