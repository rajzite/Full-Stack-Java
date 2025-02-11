abstract class Fruit{				// if class contain abstract then need to do class also abstract
	
	abstract double cost();			//abstract method. how to identify it does not have curly bracket'{'
}
class Apple extends Fruit{			//Apple is the subclass of class Fruit
	double perKgPrice;				//data member
	double weight;
	Apple(double perKgPrice,double weight){			//Constructor to assign the values
		this.perKgPrice = perKgPrice;
		this.weight = weight;
	}
	
	double cost() {					//always override the abstract method if super class contains abstract method 
		return perKgPrice * weight;	//Calculate the cost as per weight and per kg price
	}
}
class Mango extends Fruit{			//Mango is the subclass of class Fruit
	double perKgPrice;
	double weight;
	Mango(double perKgPrice,double weight){
		this.perKgPrice = perKgPrice;
		this.weight = weight;
	}
	
	double cost() {
		return perKgPrice * weight;
	}
}

public class FruitDemo {

	public static void main(String[] args) {
		
		Fruit f1 = new Apple(120,0.5);
		System.out.println("Cost is : "+f1.cost());
		
		Fruit f2 = new Mango(520,2);
		System.out.println("Cost is : "+f2.cost());

	}

}
