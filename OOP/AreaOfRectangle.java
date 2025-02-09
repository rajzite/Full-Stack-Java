class Rectangle{
	double length;	//data member
	double breadth;
	double area;
	Rectangle(double length,double breadth){	//constructor
		this.length = length;				// In this line we are taking the value from the parameter and assigning that value to data member using this keyword
		this.breadth = breadth;
	}
	void displayarea() {
		area = length * breadth;			//formula to find the area
		System.out.println("Area of the Rectangle is : "+area);			//to display the message of area of rectangle
	}
}

public class AreaOfRectangle {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(10,20);	//create an object r1 and using constructor we assign the values.
		r1.displayarea();						//display the area of rectangle
		
		Rectangle r2 = new Rectangle(20.5,10.8);
		r2.displayarea();
		
	}

}
