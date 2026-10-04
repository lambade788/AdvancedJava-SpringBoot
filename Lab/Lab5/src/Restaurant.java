public class Restaurant {

    private boolean isorderPlaced= false;
    private boolean isorderCooked=false;

    // Method called by the Waiter thread
    public synchronized void foodOrder(String orderName){
        // Print the order received by the waiter
        System.out.println(Thread.currentThread().getName()+" receive the order : "+orderName);

        isorderPlaced=true;
        notifyAll();
    }

    // Cook starts preparing the food
    public synchronized void cookedOrder(String orderName){

        while (!isorderPlaced){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }


        System.out.println(Thread.currentThread().getName()+
                " : Chef has received the order.");

        System.out.println(Thread.currentThread().getName() +
                " : Cooking is under process...");

        isorderCooked=true;
        notifyAll();
    }

    // Method called by the Customer thread
    public synchronized void recivedOrder(String orderName){

        while (!isorderCooked){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }


        System.out.println(Thread.currentThread().getName()+
                " received the order: " + orderName);
    }
}
