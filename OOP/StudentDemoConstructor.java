class StudentConstructor{
	int rollNum;				//data member
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;
	StudentConstructor(int rollNum,String studName,int mark1,int mark2,int mark3){	//Assign values using constructor. constructor is a method name which is same as class name
		this.rollNum = rollNum;				//this keyword is used if the parameter and data member name is same
		this.studName = studName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	void calculateTotal(){				//this method calculates the total marks of the student
		totalMarks = mark1 + mark2 + mark3;		
	}
	void displayStudDetails() {			//this method displays all the details of the student
		System.out.println("Student Roll No : "+rollNum);
		System.out.println("Student Name : "+studName);
		System.out.println("Total Marks : "+totalMarks);
	}
	
}
public class StudentDemoConstructor {

	public static void main(String[] args) {

		StudentConstructor s1 = new StudentConstructor(201, "Sahil", 70, 72, 82);				//Created an object s1 of class Student. //Assigned values of the student using constructor	
		s1.calculateTotal();								//This method is call to calculate the total of marks
		s1.displayStudDetails();							//This method is used to display details
		StudentConstructor s2 = new StudentConstructor(202, "Pranav", 89, 83, 92);				//Created another object for other student.	//Assigned values of the student using constructor	
		s2.calculateTotal();
		s2.displayStudDetails();

	}

}
