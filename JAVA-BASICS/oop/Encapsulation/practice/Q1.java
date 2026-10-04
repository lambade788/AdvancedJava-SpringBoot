package oop.Encapsulation.practice;

// Create class BankAccount

// private balance
// getter & setter
// prevent negative balance

class BankAccount{
    private int balance;

     public BankAccount(int intialbalance){
        if(intialbalance >= 0){
            this.balance=intialbalance;
        }else System.out.println("Amount can not be negative");
     }


    int getbalance(){
        return balance;
    }
     
    void setbalance(int amount){
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("Balance cannot be negative");
        }
    }

}
public class Q1 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(10000000);
        System.out.println(b1.getbalance());
        b1.setbalance(-500000);
        b1.setbalance(200000);
        System.out.println(b1.getbalance());

    }
    
}
