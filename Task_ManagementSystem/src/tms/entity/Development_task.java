package tms.entity;

public class Development_task extends Task implements Notification{

//    public Development_task(int id, String Status, String deadline) {
//        super(id, Status, deadline);
//    }



    @Override
    public void execute(){
        System.out.println("Developers are working on the task");
    }

    @Override
    public void sendNotification() {
        System.out.println("Notification send");
    }
}
