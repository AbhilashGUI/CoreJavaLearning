package CentricToAll13.Multithreading.Threads;

public class Lab246 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.start();

        Employee e2 = new Employee();
        e2.start();

        for (int i = 0; i < 7; i++)
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
                //The printStackTrace() method in Java is a tool used to handle exceptions and errors
            }


    }

}
//Creating a thread by class and also passing the piece of code to be executed by main method

class Employee extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 7; i++)
        try
        {
         System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}