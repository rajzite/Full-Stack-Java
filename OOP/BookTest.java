class Book{
	int bno;		//data members
	String bname;
	double price;
	Book(int bno,String bname,double price){		//constructor assigning values to data members using parameters
		this.bno = bno;						//if the data member and parameter name is same use 'this' keyword
		this.bname = bname;
		this.price = price;
	}
	Book(){};								//default constructor
	void display() {						//display the value of data members
		System.out.println("Book Number : "+bno);
		System.out.println("Book Name : "+bname);
		System.out.println("Book Price : "+price);
	}
	
	
}
class SpecialEditionBook extends Book{				//SpecialEditionBook is a subclass of Class Book
	double discount;
	SpecialEditionBook(int bno,String bname,double price,double discount){	//constructor assigning values to data members using parameters
		super(bno,bname,price);												//using super() we call the override method
		discount /= 100;				
		this.discount = discount*price;									//Calculated the discount price
	}
	void display() {
		super.display();									//using super.display() to override the display method of Book class
		System.out.println("Discount Price : "+discount);
		System.out.println("---------------------------");
	}
}

public class BookTest {

	public static void main(String[] args) {
		
//		Book b1 = new Book();
		Book s1 = new SpecialEditionBook(101,"World War II",1000,25);		//create an object and assign the value using constructor
		s1.display();
		
		Book s2 = new SpecialEditionBook(552,"English Speking",2000,15);
		s2.display();
		
	}

}
