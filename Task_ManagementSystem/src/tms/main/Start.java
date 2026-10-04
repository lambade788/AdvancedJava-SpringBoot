package tms.main;

import tms.entity.Development_task;
import tms.entity.Finance;
import tms.entity.HR_task;
import tms.entity.Task;

public class Start {
    public static void main(String[] args) {

        System.out.println("----------Task Management System--------------");
        System.out.println("----------------------------------------------");
//        Development_task d1 = new Development_task(1,"Pending","48hrs");
//        d1.execute();
//        d1.Displaytask();

//        HR_task h1 = new HR_task(1,"Ongoing","24hrs");
//
//        HR_task h2 = new HR_task(2,"Ongoing","24hrs");
//        h1.execute();
//        h1.Displaytask();
//
//        Finance f1 = new Finance(3,"Pending","20hrs");
//        f1.execute();
//        f1.Displaytask();
//
//        Finance f2 = new Finance(3,"Pending","20hrs");
//        f2.execute();
//        f2.Displaytask();
//
//        Finance f3 = new Finance(4,"Pending","10hrs");
//        f3.execute();
//        f3.Displaytask("Details of the task");
//        f3.Displaytask(4);


        Development_task d1= new Development_task();
        d1.setId(1);
        d1.setStatus("Pending");
        d1.setDeadline("10hrs");
        System.out.println(d1.getId());
        d1.execute();
        d1.Displaytask();
        d1.sendNotification();
//
//        Finance f1 = new Finance();
//        f1.setId(2);
//        f1.setStatus("Pending");
//        f1.setDeadline("20hrs");
//        f1.execute();
//        f1.Displaytask();

//        Task task;
//
//        task= new Development_task();
//        task.setId(1);
//        task.send



    }
}
