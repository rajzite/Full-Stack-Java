class Account{
	int accountNo;				//Data member
	String accountType;
	int accountBalance;
	void setAccountDetails(int accountNo,String accountType,int accountBalance) {		//This method set the values to the attribute
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	void withdraw(int amount) {				//withdraw method subtract the given amount from the accountBalance
		accountBalance -= amount;
	}
	void deposit(int amount) {
		accountBalance += amount;			//deposit method adds the amount to the acoountBalance
	}
	void dispAccountDetails() {				//this methods displays the account details
		System.out.println("Account Number : "+accountNo);
		System.out.println("Account Type : "+accountType);
		System.out.println("Account Balance : "+accountBalance);
	}
}

public class Main1 {

	public static void main(String[] args) {
		
		Account a1 = new Account();			// create an object a1 for class Account 
		a1.setAccountDetails(10102, "Saving", 50000);		//assign values
		a1.withdraw(10);									//withdraw amount 10
		a1.deposit(20);										//deposit amount 20
		a1.dispAccountDetails();							//display account details
		
		Account a2 = new Account();			// create another object a2 
		a2.setAccountDetails(10105, "Student", 5000);
		a2.deposit(500);
		a2.withdraw(100);
		a2.dispAccountDetails();
	}

}
