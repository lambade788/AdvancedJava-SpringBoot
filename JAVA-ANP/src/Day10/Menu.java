package Day10;

public class Menu {
    int id;
    String name;
    int Quantity;
    int price;

    public Menu(int id, String name, int quantity, int price) {
        this.id = id;
        this.name = name;
        Quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Quantity=" + Quantity +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Menu m = new Menu(1,"Rahul",2,40);
        System.out.println(m.toString());

    }
}
