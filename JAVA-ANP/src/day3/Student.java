package day3;

public class Student {

	String studentName;
	String address;
	int mobileNumber;
	String email;
	
	public Student() {
		
	}

	public Student(String studentName, 
			String address, int mobileNumber, String email) {
		super();
		this.studentName = studentName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public Student(String studentName, String address, 
			int mobileNumber) {
		super();
		this.studentName = studentName;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + "]";
	}

	public static void main(String[] args) {
		
		Student s1 = new Student("Abhishek", "Maharashtra", 
				123, "a@gmail.com");
		
		System.out.println(s1);
		
		
		//Student s2 = new Student("Prithwish","Kolkata",10.2, null);
		
		Student s3 = new Student("Raj", "Gujrat", 12345);
		
		System.out.println(s3.email);
		
		Student s4 = new Student();
		
		s4.studentName = "Priya";
		
		System.out.println(s4);
		
		//System.out.println(s1.studentName);
		
	//	System.out.println(s2.mobileNumber);
		
	}
	
}
