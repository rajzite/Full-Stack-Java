class InstanceCounter{
	static int instance=0;				//data member
	String a = "Hello World";
	InstanceCounter(){					//constructor which increment instance value
		instance++;
	}
	static int displayCount(){			//this method return the no of instance 	//create static because main method is static 
		return instance;
	}
	
	String hello() {
		return a;
	}
}

public class InstancesCount {

	public static void main(String[] args) {
		
		InstanceCounter I1 = new InstanceCounter();			//create an object of class InstanceCounter. Here it will increment the value of instance by 1
		InstanceCounter I2 = new InstanceCounter();
		InstanceCounter I3 = new InstanceCounter();
		System.out.println("Instant Count : "+ InstanceCounter.displayCount());
		
	}

}
