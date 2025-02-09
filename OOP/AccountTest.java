class Customer{
	int custId;			//data member
	String custName;
	String custAddress;
	Customer(int custId,String custName,String custAddress){		//constructor with 3 parameters
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}
	Customer(){}													//create no parameter constructor
	void display() {												// display method to display
		System.out.println("Customer ID : "+custId);
		System.out.println("Customer Name : "+custName);
		System.out.println("Customer Address : "+custAddress);
	}
}
class Account1{
	int accId;
	String accType;
	Customer cust;
	int accBalance;
	Account1(int accId,String accType,Customer cust,int accBalance){		//constructor
		this.accId = accId;
		this.accType = accType;
		this.cust = cust;
		this.accBalance = accBalance;
	}
	void display() {
		System.out.println("Account Id : "+accId);
		System.out.println("Account type : "+accType);
		cust.display();
		System.out.println("Account Balance : "+accBalance);
		System.out.println("-----------------------------------");
	}
}
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cust1 = new Customer(501,"Ajay","Ghatkopar,Mumbai-01");
		Account1 acc1 = new Account1(1001,"Salary Acc",cust1,10000);
		acc1.display();
		
		
		Customer cust2 = new Customer(502,"Ranbir","Dombavali,Mumbai-05");
		Account1 acc2 = new Account1(2001,"Saving Acc",cust2,5000);
		acc2.display();
	}

}
