package Task1.entity;

public class Circle extends Shape {

    double radius;
    double pie=3.14159;



    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void findArea() {
        double area= pie*radius*radius;
        System.out.println("Area of lab.entity.Circle : "+area);
    }
}
