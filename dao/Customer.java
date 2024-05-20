package com.chainsys.dao;

import com.chainsys.model.GroceryProjectA;
import java.util.Scanner;

public class Customer {
	static Scanner sc=new Scanner(System.in);
	public static void ratings() {
		System.out.println("Please rate our service from 1 to 5:");
		GroceryProjectA.ratings= sc.nextInt();
		if (GroceryProjectA.ratings < 1 || GroceryProjectA.ratings > 5) {
            System.out.println("Invalid rating! Please enter a number between 1 and 5.");
        } else {
            System.out.println("Thank you for your rating of " + GroceryProjectA.ratings);
        }
	}
}

        
     