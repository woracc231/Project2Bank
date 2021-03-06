package com.pancakecontrol.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.pancakecontrol.dao.EmployeeDAO;
import com.pancakecontrol.service.User;

/* putting this here for now 6/12 */

public class UserMap implements User {
	
	
	static EmployeeDAO emp = new EmployeeDAO();
	public void getAcct(String username, Connection con) {
			System.out.println("\nWelcome to the menu!\n");
			System.out.println("Here are your options:");
			System.out.println("----------------------");
			System.out.println("You may register for a \n[S]avings account\t[C]hecking account\t[B]oth");
			Scanner input = new Scanner(System.in);
			String choice = input.next();
			
			switch(choice) {
			case "S":
				System.out.println("\nSavings account");
				System.out.println("---------------");
				String sav_accounts = "sav_accounts";
				Scanner input1 = new Scanner(System.in);
				System.out.println("Please enter your name: ");
				String name = input1.next();
				emp.notify(name, sav_accounts, con);
				break;
			case "C":
				System.out.println("\nChecking account");
				System.out.println("---------------");
				Scanner input2 = new Scanner(System.in);
				System.out.println("Please enter your name: ");
				String name2 = input2.next();
				String chk_accounts = "chk_accounts";
				emp.notify(name2,chk_accounts, con);
				break;
			case "B":
				System.out.println("Savings and Checking account");
				System.out.println("----------------------------");
				Scanner input3 = new Scanner(System.in);
				System.out.println("Please enter your name: ");
				String name3 = input3.next();
				String both_accounts = "both_accounts";
				emp.notify(name3, both_accounts, con);
				break;
			default:
				System.out.println("Invalid entry");
				break;
				
			}
	}
}