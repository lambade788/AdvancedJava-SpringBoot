package loose;

public class Userservice {
    Notificationservice notificationservice;

    public Userservice(Notificationservice notificationservice) {
        this.notificationservice = notificationservice;
    }

    public void notifyuser(String message){
       notificationservice.send("Notification Hello");
    }
}
