package Day7;

public class Iphone implements Mobile1{


    @Override
    public void makeCall() {
        System.out.println("Calling");
    }

    @Override
    public void receiveCall() {

        System.out.println("Receiving");
    }

    @Override
    public void playingGame() {

    }
}
