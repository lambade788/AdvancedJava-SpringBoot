package day2;

public class Bike {
	
	//constructor
	//Default
	Bike(){
		
		System.out.println("Bike is created...");
		
	}
	
	
	
	//State - Field
	String brandName;
	String color = "Black";
	
	//behavior - Method
	public void started() {
		
		System.out.println("Bike is started...");
	}
	
	public static void main(String[] args) {
		
		//Bike b1 = new Bike();
		
	}
	
}
