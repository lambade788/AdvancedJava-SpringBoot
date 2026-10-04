package Day7;

public class Main {
    public static void main(String[] args) {

        Encapsulation e1 = new Encapsulation();

        e1.setAge(21);
        e1.setName("Rahul");
        e1.setAddress("Mumbai");
        e1.setPassword("123456");

        System.out.println(e1.getName()+" "+e1.getAge()+" "+
                e1.getAddress()+" "+e1.getPassword());


//    Abstraction

//        Mobile m = new Android();
//
//        m.makeCall();
//        m.receiveCall();

    }
}
