//CAN HAVE ARRAYS EITHER IN A CLASS OR MAIN--EITHER ONE
public class ThePound {

	// declare private array variable
	private String[] dogs;

	// constructor one parameter - THIS WILL BE THE SIZE OF THE ARRAY
	public ThePound(int arrSize) {
		
		//create array
		dogs = new String[arrSize];//EXAMPLE 3

	}
	
	//METHOD TWO PARAMETERS - ELEMENT NUMBER AND DOG NAME
	public void setArrayElement(int loc, String name) {
		
		
		dogs[loc] = name;

	}

	//METHOD TO PRINT DATA TO SCREEN
	public void printElement(int loc) {

		
		System.out.println(dogs[loc]);

	}

}
