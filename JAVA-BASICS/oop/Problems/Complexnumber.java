package oop.Problems;

public class Complexnumber{
    static class comp{
        double x ;
        double y;
        comp(int x ,int y){
            this.x=x;
            this.y=y;
        }
        comp(){
            
        }

        void print(){
            if(y>0) System.out.println(x+" +"+"i"+y);
            else System.out.println(x+"-i"+(-y));
        }

        void add(comp c){
            x += c.x;
            y += c.y;
        }

        void mul(comp c){
            double real = x*c.x - y*c.y;
            double imaginary = x*c.y + c.x*y;
            x= real;
            y= imaginary;
        }

        void divison(comp c){
            double div=(c.x*c.x)+(c.y*c.y);
            double real = (x*c.x + y*c.y)/div;
            double imaginary = (y*c.x-x*c.y)/div;

            x=real;
            y=imaginary;}
    }
    public static void main(String args[]){
       comp c1 = new comp(2,-5);
       comp c2 = new comp(3,4);
       c1.print();
       c1.add(c2);
       c1.print();
       c1.mul(c2);
       c1.print();
       c1.divison(c2);
       c1.print();
       
        



    }
}