import java.util.Scanner;

//public class functions_methods {
//    public static void printMyName(String firstname, String lastname) {
//        System.out.println(firstname + " " + lastname);
//        return;
//    }

//    public static int calculateSum(int a,int b) {
//        int sum = a + b;
//        return sum;
//    }

//    public static int calculateProduct(int a,int b){
//        return a*b;
//    }
//
//    public static void Factorial(int n){
//        if(n<=0){
//            System.out.println("Invalid Input");
//        }
//        int factorial = 1;
//        for(int i=n; i>=1; i--){
//            factorial = factorial * i;
//        }
//        System.out.println(factorial);
//        return;
//    }

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your first name:");
//        String firstname = sc.nextLine();
//        System.out.print("Enter your last name:");
//        String lastname =sc.nextLine();
//
//        printMyName(firstname,lastname);
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int n=sc.nextInt();

//        int sum=calculateSum(a,b);
//        System.out.println(sum);

//        System.out.println(calculateProduct(a,b));
//        Factorial(n);
//
//    }
//
//}


//Q1-Enter 3 numbers from the user & make a function to print their average.

//public class functions_methods {
//
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter First Number :");
//        double a=sc.nextDouble();
//        System.out.print("Enter Second Number:");
//        double b=sc.nextDouble();
//        System.out.print("Enter Third Number :");
//        double c=sc.nextDouble();
//
//        System.out.println("Average of numbers is:"+CalculateAvg(a,b,c));
//    }
//
//    public static double CalculateAvg(double a, double b, double c){
//        double avg= (float) (a + b + c) /2;
//        return (double) avg;
//    }
//}

////q2-Write a function to print the sum of all odd numbers from 1 to n.
//public class functions_methods {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number:");
//        int n = input.nextInt();
//
//        Oddnumbers(n);
//
//    }
//
//    public static int Oddnumbers(int n) {
//        int sum=0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                sum += i;
//                System.out.println(i);
//            }
//        }
//
//        System.out.println("Sum of the Odd numbers is: "+sum);
//        return n;
//    }
//}

//Q3-Write a function which takes in 2 numbers and returns the greater of those two.

//public class functions_methods {
//
//    public static int Graternumber(int a, int b) {
//        return Math.max(a, b);
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter first number:");
//        int a = input.nextInt();
//        System.out.print("Enter second number:");
//        int b = input.nextInt();
//
//        int result=Graternumber(a,b);
//
//        System.out.println("Grater number is:"+result);
//    }
//
//}

//Q4-Write a function that takes in the radius as input and returns the circumference of a circle.

//public class functions_methods{
//    public static void main(String[] args){
//        Scanner input=new Scanner(System.in);
//        System.out.print("Enter the radius:");
//        double r=input.nextDouble();
//
//        System.out.println("Circumference is: "+circumference(r));
//
//    }
//
//    public static double circumference(double r){
//        return 2 * Math.PI * r;
//    }
//
//}


// import java.util.Scanner;

//public class functions_methods {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        // This loop starts here and runs everything inside the { } forever
//        while (true) {
//            System.out.print("Enter the radius (or 0 to exit): ");
//            double r = input.nextDouble();
//
//            // Check if the user wants to quit
//            if (r == 0) {
//                System.out.println("Exiting...");
//                break; // This 'breaks' out of the loop and ends the program
//            }
//
//            // Print the result
//            System.out.println("Circumference is: " + circumference(r));
//            System.out.println("-------------------------");
//        }
//
//        input.close();
//    }
//
//    public static double circumference(double r) {
//        return 2 * Math.PI * r;
//    }
//}

//q5-Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

//public class functions_methods
//{
//    public static void main(String[] args)
//    {
//        Scanner input = new Scanner(System.in);
//        do{
//            System.out.print("Enter the Age: ");
//            int age = input.nextInt();
//
//            vote(age);
//            System.out.println("--- Loop restarting ---");
//        }while (true);
//
//    }
//
//    public static void vote(int age){
//        if(age < 0){
//            System.out.println("Enter valid number.");
//        }else if(age >18){
//            System.out.println("You are Eligible");
//        }else{
//            System.out.println("You are Not Eligible");
//        }
//    }
//}


//public class functions_methods {
//
//    // Single method to do everything
//    static void countNumbers() {
//
//        Scanner sc = new Scanner(System.in);
//
//        int positive = 0, negative = 0, zero = 0;
//        char choice;
//
//        do {
//            System.out.print("Enter a number: ");
//            int num = sc.nextInt();
//
//            if (num > 0)
//                positive++;
//            else if (num < 0)
//                negative++;
//            else
//                zero++;
//
//            System.out.print("Do you want to enter another number? (y/n): ");
//            choice = sc.next().charAt(0);
//
//        } while (choice == 'y' || choice == 'h');
//
//        System.out.println("\nCount of Positive numbers: " + positive);
//        System.out.println("Count of Negative numbers: " + negative);
//        System.out.println("Count of Zeros: " + zero);
//
//        sc.close();
//    }
//
//    // Main method
//    public static void main(String[] args) {
//        countNumbers();   // calling the only method
//    }
//}

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

//public class functions_methods {
//    public static int calculate(int x, int n) {
//
//        int result=1;
//
//        for (int i=1;i<=n;i++){
//            result=result*x;
//        }
//        return result;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number:");
//        int x = input.nextInt();
//        System.out.print("Enter number:");
//        int n = input.nextInt();
//
//       int ans=calculate(x,n);
//        System.out.println(ans);
//
//    }
//}

//Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

// import java.util.Scanner;

public class functions_methods{

    // Function to calculate GCD
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}


