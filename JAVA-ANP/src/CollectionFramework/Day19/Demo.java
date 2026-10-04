package CollectionFramework.Day19;

public class Demo {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread t1 = new Thread(counter::increment,"Thread 1");
        Thread t2 = new Thread(counter::increment,"Thread 2");
        Thread t3 = new Thread(counter::increment,"Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
