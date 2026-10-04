package CollectionFramework.Day21;

public class Project {

    private boolean taskReady = false;

    public synchronized void testTask() {

        while (!taskReady) {

            System.out.println("Task Ready Status : "+taskReady);

            try {

                System.out.println("Tester : Waiting for Developer.....");

                wait();
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

            System.out.println("Task Ready Status : "+taskReady);

            System.out.println("Tester : Started Testing.....");

        }

    }

    public synchronized void developTask() {

        System.out.println("Developer : Writing Code.....");

        taskReady = true;

        System.out.println("Developer : Coding Completed.....");

        notify();

    }

}
