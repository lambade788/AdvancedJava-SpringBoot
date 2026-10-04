package day2;

//HW
//data types in Java
//access specifier

public class Car {
	
	String brand; // fields
	String color;
	int yearOfManufacturing;
	
	
	//functions/Methods 
	//Access specifier - public, private, protected, default
	public void start() {
		
		System.out.println("Car is started...");
	}
	
	//functions
	public void stop() {
		
		System.out.println("Car is stopped...");
	}
	
	//constructor
	
	
	public static void main(String[] args) {
		
		Car c1 = new Car(); //object of car class
		c1.brand = "Tata";
		c1.color = "Black";
		
		System.out.println("Brand : " +c1.brand);
		System.out.println("Color : " +c1.color);
		
		c1.start();
		c1.stop();
		//........................................
		Car c2 = new Car();
		c2.brand= "Suzuki";
		c2.color= "Red";
		
		c2.start();
		c2.stop();
		
//		Car c3 = new Car();
		
	}
}
