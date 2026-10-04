package Day8;

public class ExceptionHandling {
    public static void main(String[] args) {

        int a=10;
        try{
            System.out.println(a/0);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
    }
}
