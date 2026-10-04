package CollectionFramework.Day19;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread is running.");


        try {
            Thread.sleep(3000);
            System.out.println("Thread completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
