package day9;

public class ThrowsKeyword {

    public static void checkAge(int age) throws InvalidAgeException{
        if(age<18) {
            throw new InvalidAgeException("Not eligible.");
        }
        System.out.println("Eligible.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
