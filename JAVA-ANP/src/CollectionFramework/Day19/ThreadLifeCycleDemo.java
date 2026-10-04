package CollectionFramework.Day19;

import CollectionFramework.Day18.MyThread;

public class ThreadLifeCycleDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();

        // NEW State
        System.out.println("After Object Creation: " + t1.getState());

// RUNNABLE State
        t1.start();
        System.out.println("After start(): " + t1.getState());

// Give CPU some time
        Thread.sleep(2500);

        System.out.println("While Sleeping: " + t1.getState());

// Wait until thread finishes
        t1.join();

        System.out.println("After completion: " + t1.getState());

    }
}
