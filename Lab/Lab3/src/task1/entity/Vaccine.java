package task1.entity;

abstract public class Vaccine {
    int age;
    String nationality;




    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    abstract public void firstDose();
    abstract public void secondDose();

    abstract void boosterDose();


}
