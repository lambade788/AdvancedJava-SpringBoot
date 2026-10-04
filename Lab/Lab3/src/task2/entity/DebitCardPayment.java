package task2.entity;

public class DebitCardPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " successful through Debit Card.");
    }
}
