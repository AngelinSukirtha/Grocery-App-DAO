package com.chainsys.util;

import com.chainsys.model.GroceryProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GroceryConnection {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/g_app_project", "root",
				"Angelin#18");
		return connection;

	}

	public static void insert(GroceryProject gp) throws ClassNotFoundException, SQLException {
		Connection connection = GroceryConnection.getConnection();

		String insert = "insert into groceryappproject values (?, ?, ?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insert);

		preparedStatement.setString(1, gp.getUserName());
		preparedStatement.setString(2, gp.getPassword());
		preparedStatement.setString(3, gp.getPhoneNo());
		preparedStatement.setString(4, gp.getMailId());
		int rows = preparedStatement.executeUpdate();
		System.out.println(rows + " rows inserted");
	}

	public static void update(GroceryProject gp) throws ClassNotFoundException, SQLException {
		Connection connection = GroceryConnection.getConnection();

		String update = "update groceryappproject set mailId='angelin@gmail.com' where userName='Angelin18'";
		PreparedStatement preparedStatement = connection.prepareStatement(update);
		int rows = preparedStatement.executeUpdate();
		System.out.println(rows + " rows update");
	}

	public static void delete(GroceryProject gp) throws ClassNotFoundException, SQLException {
		Connection connection = GroceryConnection.getConnection();
		String delete = "delete from groceryappproject where userName='Rithiga'";
		PreparedStatement preparedStatement = connection.prepareStatement(delete);
		int rows = preparedStatement.executeUpdate();
		System.out.println(rows + " rows delete");
	}

	public static void read(GroceryProject gp) throws ClassNotFoundException, SQLException {
		Connection connection = GroceryConnection.getConnection();
		String read = "select userName from groceryappproject where phoneNo='9876543212'";
		// PreparedStatement preparedStatement = connection.prepareStatement(read);
		Statement stmt = connection.createStatement();
		ResultSet rows = stmt.executeQuery(read);
		System.out.println(rows + " rows read");
	}
}
