package loose;

public class EmailService implements Notificationservice {
    @Override
    public void send(String message){
        System.out.println("Email:"+message);
    }
}
