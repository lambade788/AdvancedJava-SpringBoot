package task2.entity;

public class CreditCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " successful through Credit Card.");
    }
}
