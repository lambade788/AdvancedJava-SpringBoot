package CollectionFramework.Day18;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("My thread is running");
    }

    public void run(int a){
        System.out.println(a);
    }
}
