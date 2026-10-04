package CollectionFramework.Day19;

public class Counter {

    int count =0;

    public synchronized void increment(){
        System.out.println(Thread.currentThread().getName()+" Entered");
        count++;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+" Leaving");
    }
}
