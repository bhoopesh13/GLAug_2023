package com.bhoopesh.main;

import java.util.Scanner;

import com.bhoopesh.model.Customer;
import com.bhoopesh.service.IndianBank;

public class BankDriver {

	public static void main(String[] args) {
		
		
		//create object of indian bank
		IndianBank banking = new IndianBank();
		
		//create customer object
		Customer customer1 = new Customer("12345678","password");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to login page");
		System.out.println("");
		
		// ask customer to provide details
		System.out.println("Enter the account number");
		String bankAccountNo = sc.next();
		
		System.out.println("Enter the password");
		String password = sc.next();
		
		//validate the credentials and proceed after that
		if(bankAccountNo.equals(customer1.getBankAccountNo()) &&
					password.equals(customer1.getPassword())){
			
			System.out.println("\n\n Welcome to Indian Bank \n\n");
			
			int option;
			do {
				System.out.println("---------------------");
				System.out.println("Enter the operation that you want to perform");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit");
				System.out.println("3. Withdrawl");
				System.out.println("4. Transfer");
				System.out.println("5. Logout");
				System.out.println("---------------------");

				
				option = sc.nextInt();
				
				switch(option) {
				
				case 1:{
					banking.checkBalance();
					break;
				}
				
				case 2:{
					banking.deposit();
					break;
				}
				
				case 3:{
					banking.withdrawal();
					break;
				}
				
				case 4:{
					banking.transfer();
					break;
				}
				
				case 5:{
					banking.logout();
					break;
				}
				
				default: {
					System.out.println("Enter valid option");
				}
				
				}
			}
			
			while(option != 5);
			System.out.println("Exit successfully");
			sc.close();
		}
		else
			System.out.println("Invalid credentials");
	}

}
