package tms.entity;

public class Finance extends Task {

    private static double amount = 100000;

    public static double getAmount() {
        return amount;
    }

    public static void setAmount(double amount) {
        Finance.amount = amount;
    }

//    public Finance(int id, String status, String deadline) {
//        super(id, status, deadline);
//    }

    @Override
    public void execute() {
        System.out.println("Finance Team is working on the task");

        amount = amount - (amount * 10/100);

        System.out.println("Remaining Amount: " + amount);
    }
}