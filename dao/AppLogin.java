package com.chainsys.dao;

import java.sql.SQLException;
import java.util.Scanner;
import com.chainsys.model.GroceryProject;
import com.chainsys.util.GroceryConnection;

public class AppLogin {
	Scanner sc = new Scanner(System.in);
	static GroceryProject ga = new GroceryProject();

	public void userName() {
		while (true) {
			System.out.println("Enter the Username: " + "\n[Username must have upper case,lower case,and digits]");
			String userName = sc.nextLine();
			if (userName.matches("^[a-z A-Z 0-9]{6,}$")) {
				ga.setUserName(userName);

				break;
			} else {
				System.out.print("INVALID USERNAME\n");
			}
		}
	}

	public void password() {
		while (true) {
			System.out.println("Enter the password: "
					+ "\n[password must have upper case,lower case,special characters and digits]");
			String password = sc.nextLine();
			if (password.matches("^[a-z A-Z]{4,}[@#$%^&*][0-9]{2,}")) {
				ga.setPassword(password);
				break;
			} else {
				System.out.print("INVALID PASSWORD\n");
			}
		}
	}

	public void phoneNo() {
		while (true) {
			System.out.println("Enter your phone number: ");
			String phoneNo = sc.nextLine();
			if (phoneNo.matches("^\\d{10}$")) {
				ga.setPhoneNo(phoneNo);

				break;
			} else {
				System.out.println("INVALID PHONE NUMBER\n");
			}
		}
	}

	public void mailId() {
		while (true) {
			System.out.println("Enter your mail id: ");
			String mailId = sc.nextLine();
			if (mailId.matches("^(?=.*[0-9])[a-z0-9._%+-]+@[a-z]+.[a-z]{2,}$")) {
				ga.setMailId(mailId);
				break;
			} else {
				System.out.println("INVALID EMAIL\n");
			}
		}
	}

	public static void addData() throws ClassNotFoundException, SQLException {
		GroceryConnection.insert(ga);
		GroceryConnection.update(ga);
		GroceryConnection.delete(ga);
		GroceryConnection.read(ga);
	}
}
