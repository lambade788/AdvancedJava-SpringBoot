package day2;

public class Pen {
	
	//states
	String type;
	String color;
	
	//Behavior
	public void write() {
		
		System.out.println("Started writing...");
		
	}
	
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		p1.type = "Gel";
		p1.color = "Green";
		
		System.out.println("Type: "+p1.type);
		System.out.println("Color: "+p1.color);
			
		p1.write();
		
	}
	
}
