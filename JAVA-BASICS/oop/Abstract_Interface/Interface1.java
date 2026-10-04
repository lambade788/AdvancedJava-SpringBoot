package oop.Abstract_Interface;

interface computer{
    public void code();
}

class laptop implements computer{
    @Override
    public void code(){
        System.out.println("Code,Compiler,Run");
    }

}

class desktop implements computer{
    @Override
    public void code(){
        System.out.println("Code,Compiler,Run,Fast");
    }
}

class developer {
    public void devapp(computer cap){
        cap.code();
    }
}

public class Interface1{
    public static void main(String[] args) {
       
       
        computer lap = new laptop();
        computer desk = new desktop();

        developer Rahul = new developer();


        Rahul.devapp(desk);
    }
}