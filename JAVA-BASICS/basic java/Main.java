// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
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
////b.CharAt
//System.out.println(name.charAt(2));
//
////c.Replace
//System.out.println(name.replace('a','p'));
//
////d.Length
//System.out.println(name.length());


//---------------------Arrays---------------------
//    int physics=91;
//    int chemistry=93;
//    int maths=98;
//    int english=97;
//
//    int [] marks = new int[4];
//    marks[0]=91;
//    marks[1]=93;
//    marks[2]=98;
//    marks[3]=97;
//
//    System.out.println(marks[2]);

//    int[] marks={92,98,94};
//        Arrays.sort(marks);
//
//    int [][] finalmarks={{92,98,94},{89,90,99}};
//        System.out.println(finalmarks[1][1]);

//
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Input your age:");
//        int age= sc.nextInt();
//        System.out.println(age);
//
//        System.out.println("Input your name:");
//        String name= sc.nextLine();
//        System.out.println(name);

//    }
//}


//--------------------CONSTANTS, VARIABLES & DATA TYPES-----------------------------

//                         CONSTANTS
//A constant is a variable whose value cannot be changed.
//Syntax of Constant: final dataType VARIABLE_NAME = value;
//        Example:
//        public class Test {
//            public static void main(String[] args) {
//                final double PI = 3.14159;
//                System.out.println(PI);
//
//                // PI = 3.14;  ❌ ERROR (Cannot change)
//            }
//        }
//        String name = "Rahul";
//        int age = 21;
//        double marks = 85.5;
//        final String COLLEGE = "ABC Engineering College";
//
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Marks: " + marks);
//        System.out.println("College: " + COLLEGE);

//
//        System.out.println("1.Addition");
//        System.out.println("2.Subtraction");
//        System.out.println("3.Multiplication");
//        System.out.println("4.Division");
//
//
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Choose the Operation from above:");
//        int n=sc.nextInt();
//        switch (n){
//            case 1: System.out.println("Addition");
//            break;
//            case 2: System.out.println("Subtraction");
//            break;
//            case 3: System.out.println("Multiplication");
//            break;
//            case 4: System.out.println("Division");
//            break;
//            case 5: System.out.println("Invalid");
//            break;
//        }
//
//
//
//        System.out.println("enter first number:");
//        int a=sc.nextInt();
//        System.out.println("enter second number:");
//        int b=sc.nextInt();
//
//
//        int sum=a+b;
//        int mul=a*b;
//        int sub=a-b;
//        int div=a/b;
//
//        switch(n){
//            case 1: System.out.println("Addition is "+sum);
//            break;
//            case 2: System.out.println("Subtraction is "+sub);
//            break;
//            case 3: System.out.println("Multiplication is "+mul);
//            break;
//            case 4: System.out.println("Division is "+div);
//            break;
//            default: System.out.println("Invalid input");
//        }

//import javax.swing.JOptionPane;
//
//public class Main {
//    public static void main(String[] args) {
//        // 1. Create a Menu String
//        String menu = "1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n\nChoose an operation:";
//
//        // 2. Get the operation choice via popup
//        String input = JOptionPane.showInputDialog(menu);
//        if (input == null) System.exit(0); // Exit if user hits cancel
//        int n = Integer.parseInt(input);
//
//        // 3. Get the numbers via popup
//        String num1Str = JOptionPane.showInputDialog("Enter first number:");
//        String num2Str = JOptionPane.showInputDialog("Enter second number:");
//
//        double a = Double.parseDouble(num1Str);
//        double b = Double.parseDouble(num2Str);
//        String resultMessage = "";
//
//        // 4. Your Switch Logic (slightly modified for decimals)
//        switch (n) {
//            case 1:
//                resultMessage = "Addition is " + (a + b);
//                break;
//            case 2:
//                resultMessage = "Subtraction is " + (a - b);
//                break;
//            case 3:
//                resultMessage = "Multiplication is " + (a * b);
//                break;
//            case 4:
//                if (b != 0) {
//                    resultMessage = "Division is " + (a / b);
//                } else {
//                    resultMessage = "Error: Cannot divide by zero!";
//                }
//                break;
//            default:
//                resultMessage = "Invalid input";
//        }
//
//        // 5. Output the result in a final window
//        JOptionPane.showMessageDialog(null, resultMessage);
//    }
//}



































    // }
// }