class Student{
	int rollNum;				//data member
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;
	void setStudentDetails(int rollNum,String studName,int mark1,int mark2,int mark3){	//method which sets the values to all data members
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
public class StudentDemo {

	public static void main(String[] args) {

		Student s1 = new Student();				//Created an object of class Student
		s1.setStudentDetails(101, "Rohit", 95, 97, 92); 	//Assigned values of the student
		s1.calculateTotal();								//This method is call to calculate the total of marks
		s1.displayStudDetails();							//This method is used to display details
		Student s2 = new Student();				//Created another object for other student
		s2.setStudentDetails(102, "Chaitanya", 90, 92, 95);
		s2.calculateTotal();
		s2.displayStudDetails();

	}

}
