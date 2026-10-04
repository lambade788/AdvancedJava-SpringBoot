package loose;

public class Smsservice implements Notificationservice {
    @Override
    public void send(String messsage){
        System.out.println("SMS:"+messsage);
    }
}
