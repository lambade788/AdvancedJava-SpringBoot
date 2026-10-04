import java.util.Scanner;

public class datatypes {
    public static void main(String[] args) {
//---------------DATA TYPES---------------
//        String Name="Rahul";
//        String LastName="Lambade";
//        int Age=21;
//        float MARKS=94;
//        byte NO=9;
//        char gender='M';
//        boolean isadult=true;
//        long Number=9321795019L;
//
//        System.out.println(Name);
//        System.out.println(LastName);
//        System.out.println(Age);
//        System.out.println(MARKS);
//        System.out.println(gender);
//        System.out.println(isadult);
//        System.out.println(Number);
//        System.out.println(NO);
//        System.out.println("Hello World,"+"My Name is "+ Name+" "+LastName+"."+"I am "+Age+" years old.");
//-------INPUT---------------
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Input your age:");
//        int age= sc.nextInt();
//        System.out.println(age);
//
//        System.out.println("Input your name:");
//        String name= sc.nextLine();
//        System.out.println(name);

//--------------------STRING CLASS---------------------
// Strings are immutable non-primitive data types in Java.
// Once a string is created it is value cannot be changed
// i.e. if we wish to alter its value then a new string with a new value has to be created.
// This class in java has various important methods that can be used for Java objects. These include:

                // a.Concatenation
//String name="Rahul";
//String lastname="Lambade";
//String Fullname=name+" "+lastname;
//        System.out.println(Fullname);
//
//b.CharAt
//System.out.println(name.charAt(2));
//
//.Replace
//System.out.println(name.replace('a','p'));
//
//d.Length
//System.out.println(name.length());

// Q1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("sum is "+sum);

    }
}
