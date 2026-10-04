public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        String order="Biryani";

        Thread customer = new Thread(() -> {restaurant.recivedOrder(order);},"Customer");

        Thread waiter = new Thread(() -> {restaurant.foodOrder(order);}, "Waiter");

        Thread cook = new Thread(() -> {restaurant.cookedOrder(order);}, "Cook");

        // Start in any order
        customer.start();
        cook.start();
        waiter.start();




    }
}
