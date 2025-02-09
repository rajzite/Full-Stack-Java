class AccountConstructor{
	int accountNo;				//Data member
	String accountType;
	int accountBalance;
	AccountConstructor(int accountNo,String accountType,int accountBalance) {		//This Constructor set the values to the attribute
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	void withdraw(int amount) {				//withdraw method subtract the given amount from the accountBalance
		System.out.println("Withdraw Amount : "+amount);
		accountBalance -= amount;
	}
	void deposit(int amount) {
		System.out.println("Deposit Amount : "+amount);
		accountBalance += amount;			//deposit method adds the amount to the acoountBalance
	}
	void dispAccountDetails() {				//this methods displays the account details
		System.out.println("Account Number : "+accountNo);
		System.out.println("Account Type : "+accountType);
		System.out.println("Account Balance : "+accountBalance);
	}
}

public class Main2Constructor {

	public static void main(String[] args) {

		AccountConstructor acc1 = new AccountConstructor(500101,"Salary Account",65000);	//create an object acc1 and using constructor we assign the values.
		acc1.withdraw(5000);
		acc1.deposit(1000);
		acc1.dispAccountDetails();
		
		AccountConstructor acc2 = new AccountConstructor(500202,"Salary Account",150000);
		acc2.dispAccountDetails();
		acc2.deposit(1000);
		acc2.withdraw(50000);
		acc2.dispAccountDetails();

	}

}
