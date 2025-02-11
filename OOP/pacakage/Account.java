package com.account;
import java.util.Scanner;				//import class Scanner to take the user input

public class Account{
	Scanner sc = new Scanner(System.in);		//create object for Scanner class
	protected int acctId;						//data member
	protected String acctType;
	protected double acctBalance;
	protected double amount;
	public Account(){							//Constructor 
		System.out.print("Enter Account Id : ");
		acctId = sc.nextInt();
		System.out.print("Enter Account Type : ");
		acctType = sc.next();
		System.out.print("Enter Account Balance : ");
		acctBalance = sc.nextDouble();
	}
	public void deposit() {						//deposit() method to deposit the amount 
		System.out.println("Enter amount to deposit : ");
		amount = sc.nextDouble();				//take the amount value to deposit				
		acctBalance += amount;
	}
	public void withdraw() {
		System.out.println("Enter amount to withdraw : ");
		amount = sc.nextDouble();				//take the amount value to withdraw
		if(amount <= acctBalance) {				//if withdraw amount is less than account balance then only user can remove the amount
			this.acctBalance -= amount;	
		}
		else {
			System.out.println("Insufficient Balance");	//if withdraw amount is greater than account balance then this message will display
		}
		
	}
	public int getBalance() {
		return (int)acctBalance;	//it will return the account balance
	}
	public void display() {
		System.out.println("Account ID : "+acctId);
		System.out.println("Account Type : "+acctType);
		System.out.println("Available Balance : "+acctBalance);
	}
}

