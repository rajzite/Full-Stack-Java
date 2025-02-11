interface Apple1{							//Created a class interface 
	double cost();							//all method are public and abstract by default in interface class
}
interface Mango1{
	double cost();
}
class Fruit1 implements Apple1,Mango1{		//a class can interface multiple interface
	double pricePerKg;						//data member
	double weight;
	Fruit1(double pricePerKg,double weight){	//created a constructor to assign the values
		this.pricePerKg = pricePerKg;
		this.weight = weight;
	}
	public double cost() {					//If a class implements an interface then we need to override all abstract methods or make the class as abstract 
		return pricePerKg * weight;
	}
}


public class FruitDemoInterface {

	public static void main(String[] args) {
		
		Apple1 A1 = new Fruit1(60,2);	//Cannot create an object for an interface but we can create a references referring to subclass
		System.out.println(A1.cost());	//Using reference call the method 
		Mango1 M1 = new Fruit1(800,2);	//created another reference
		System.out.println(M1.cost());
	}

}
