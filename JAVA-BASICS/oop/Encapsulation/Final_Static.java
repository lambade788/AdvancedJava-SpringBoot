package oop.Encapsulation;

  class Hospital{
        final static String name="Fortis";
        int wardno;
        int count;
        
        Hospital(){

        }

        Hospital(int wardno , int count){
            this.wardno=wardno;
            this.count=count;
        }

        private void print(){
            System.out.println(name+" "+wardno+" "+count);
        }

        void print2(){
            print();
        }
    }

public class Final_Static{
    public static void main(String[] args) {
        Hospital h1 = new Hospital(4,78);
        Hospital h2 = new Hospital();

        h1.print2();
        h2.print2();



    }
}