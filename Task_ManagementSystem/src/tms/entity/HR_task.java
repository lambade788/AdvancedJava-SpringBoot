package tms.entity;

public class HR_task extends Task{

//    public HR_task(int id, String Status, String deadline) {
//        super(id, Status, deadline);
//    }

    @Override
    public void execute(){
        System.out.println("HR are working on the task");
    }
}
