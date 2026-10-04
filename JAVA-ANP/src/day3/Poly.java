package day3;

public class Poly {
	
	public void sum() {
		
		System.out.println(10+2);
	}
	
	public void sum(int a) {
		
		System.out.println(10+a);
		
	}

	public static void main(String[] args) {
		
		Poly p1 = new Poly();
		
		p1.sum();
		p1.sum(3);
		

	}

}
