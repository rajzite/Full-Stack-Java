package com.account.test;

import com.account.Account;		//import class Account from the folder com/account
import java.util.Scanner;		//import class Scanner for taking the user input

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//create an object for scanner class.
		int ch;										//data member
		System.out.println("Enter account details ");
		Account ac = new Account();					//object of class Account that has imported
		System.out.println("Enter your choice : ");
		System.out.println("1. Deposit \n 2. Withdraw \n 3. Display Balance \n 4. Exit");
		ch = sc.nextInt();							//taking the choice from the user
		while(ch!=4) {								//if choice = 4 it will come out of the break loop
			switch(ch) {							//it takes the choice and assign the case as per choice
			case 1:
				ac.deposit();						//using object it will call the method deposit() of class Account
				break;
			case 2:
				ac.withdraw();						//using object it will call the method withdraw() of class Account
				break;
			case 3:
				System.out.println(ac.getBalance()); 		//using object it will call the method getBalance() of class Account
				break;
			default:										
				System.out.println("Enter Valid Choice!!");		//this message will display when the choice is wrong
			}
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
		}
		ac.display();						//using object it will call the method display() of class Account
	}

}
