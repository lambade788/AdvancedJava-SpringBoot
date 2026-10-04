package Task1.entity;

public class Rectangle extends Shape {

    int length;
    int width;

    public Rectangle(int length,int width) {
        this.length=length;
        this.width=width;
    }


    @Override
    public void findArea() {
        int area=length*width;
        System.out.println("Area of lab.entity.Rectangle : "+area);
    }
}
