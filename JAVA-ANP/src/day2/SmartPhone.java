package day2;

//OOPs
//Object, Class, Abstraction, Polymorphism, Encapsulation, Inheritance

//Object - State and Behaviour

//color, weight, OS, etc...  - STATES of object
//Calling, Play games, change your wallpaper, take pictures, etc... - Behevior of the object

public class SmartPhone {
	
	String brandName;	//STATE  
	String modelName;	//STATE	
	
	//Behavior
	public void calling() {
		
		System.out.println("Calling");
		
	}
	
	public static void main(String[] args) {
		
		SmartPhone phone1 = new SmartPhone(); //created a smartphone object
		phone1.brandName= "Google";
		phone1.modelName= "Pixel";
		
		
		SmartPhone phone2 = new SmartPhone();
		phone2.brandName= "Apple";
		phone2.modelName= "Iphone";
		
		
		System.out.println("Brand Name: "+phone1.brandName + 
				"  Model Name :"+ phone1.modelName);
		
		System.out.println("Brand Name: "+phone2.brandName + 
				"  Model Name :"+ phone2.modelName);
		
		phone2.calling();
		
	}
}
