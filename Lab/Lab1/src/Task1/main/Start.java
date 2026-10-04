package Task1.main;

import Task1.entity.Circle;
import Task1.entity.Rectangle;
import Task1.entity.Triangle;


public class Start {
    public static void main(String[] args) {

        Rectangle r1=new Rectangle(10,20);
        r1.findArea();

        Circle c1 =new Circle(5);
        c1.findArea();

        Triangle t1 = new Triangle(12,34);
        t1.findArea();
    }
}
