
public class DogTester {

	public static void main(String[] args) {
		
		//create object of Thepound class
		ThePound object1 = new ThePound(3);
		
		//set array elements
		object1.setArrayElement(0, "spot");
		object1.setArrayElement(1, "rover");
		object1.setArrayElement(2, "rufus");
		
		
		//call method and print to screen
		object1.printElement(0);
		object1.printElement(1);
		object1.printElement(2);
	
		
	}

}
