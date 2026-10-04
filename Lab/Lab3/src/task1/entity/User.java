package task1.entity;

public class User extends Vaccine{
    public User(int age, String nationality) {
        super(age, nationality);
    }

    boolean firstdosetaken=false;

    @Override
    public void firstDose(){
        if(age>18 && nationality.equalsIgnoreCase("Indian") ){
            System.out.println("You are eligible.");
            System.out.println("After vaccination you have to pay 250rs");
            firstdosetaken=true;
        }
        else {
            System.out.println("You are not eligible.");
        };
    };

    @Override
    public void secondDose(){
        if (firstdosetaken) {
            System.out.println("You are eligible for the Second Dose.");
        } else {
            System.out.println("Please complete the First Dose before taking the Second Dose.");
        }
    };

    @Override
   public void boosterDose() {
        if (firstdosetaken) {
            System.out.println("You are eligible for the Booster Dose.");
        } else {
            System.out.println("You are not eligible for the Booster Dose.");
        }
    }
}
