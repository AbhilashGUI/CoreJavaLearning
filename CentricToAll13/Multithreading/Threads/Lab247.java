package CentricToAll13.Multithreading.Threads;

public class Lab247 {
    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("Employee");

        Employee1 e1 = new Employee1(threadGroup, "IT department");
        e1.start();

        Employee1 e2 = new Employee1(threadGroup, "Finance department");
        e2.start();

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
                //The Java Thread. sleep() method can be used to pause the execution of the current thread for a specified time in milliseconds.
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

//Creating a thread by class and also passing the piece of code to be executed by main method.
//Creating a thread group as well, that defines individual thread status

class Employee1 extends Thread {
    Employee1(ThreadGroup threadGroup, String name) {
        super (threadGroup,name);             //Defining the super constructor without parent objects
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}