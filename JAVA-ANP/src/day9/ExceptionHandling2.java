package day9;

public class ExceptionHandling2 {
    public static void main(String[] args) {

        int age=17;

        if(age<18){
            throw new ArithmeticException("you are not eligible.");
        }

        System.out.println("you are eligible.");
    }
}
