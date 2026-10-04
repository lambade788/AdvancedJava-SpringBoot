package Day7;

public class Android extends Mobile{

    @Override
    void makeCall() {
        System.out.println("Calling from Android");
    }

    @Override
    void receiveCall() {
        System.out.println("Receiving call");
    }

}
