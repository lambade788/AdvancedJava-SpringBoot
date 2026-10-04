package CollectionFramework.Day21;

public class Demo {

    public static void main(String[] args) {

        // Created project class object
        Project project = new Project();

        // Created a tester thread and using lambda expression to call the testTask()
        // from project object
        Thread tester = new Thread(project::testTask);

        // Created a developer thread and using lambda expression to call the
        // DeveloperTask()
        // from project object
        Thread developer = new Thread(() -> {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException ignored) {}

            project.developTask();

        });

        tester.start();

        developer.start();

    }

}
