package tms.entity;

abstract public class Task {

    private int id;
    private String Status;
    private String deadline;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0){
        this.id = id;}
        else{
            System.out.println("Id can't be less than 1");
        }
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

//    public Task(int id, String Status, String deadline) {
//        super();
//        this.id = id;
//        this.Status=Status;
//        this.deadline=deadline;
//    }

    abstract public void execute();

    public void Displaytask(){
        System.out.println("-----------------------------------------------");

        System.out.println("Taskid: "+id);
        System.out.println("Status: "+Status);
        System.out.println("Deadline: "+deadline);

        System.out.println("-----------------------------------------------");
    }

    public void Displaytask(String message){
        System.out.println(message);
        Displaytask();
    }

    public void Displaytask(int id){
        System.out.println("Taskid : "+id);
    }





}
