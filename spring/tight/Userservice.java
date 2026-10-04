package tight;

public class Userservice {
    Notificationservice notificationservice = new Notificationservice();
    public void notifyuser(String message){
        notificationservice.send("Hello");
    }
}
