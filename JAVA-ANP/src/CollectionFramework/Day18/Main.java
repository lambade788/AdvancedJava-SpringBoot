package CollectionFramework.Day18;

public class Main {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        mt.run(12);

        System.out.println("Main thread is running");

        MyRunnable mr = new MyRunnable();

        Thread tr = new Thread(mr);

        tr.start();

        System.out.println("Main thread is running");

    }
}
