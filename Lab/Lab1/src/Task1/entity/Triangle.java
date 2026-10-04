package Task1.entity;

public class Triangle extends Shape {
    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public void findArea(){
        double Area = (height*base)/2;
        System.out.println("Area of lab.entity.Triangle : "+Area);
    }
}
