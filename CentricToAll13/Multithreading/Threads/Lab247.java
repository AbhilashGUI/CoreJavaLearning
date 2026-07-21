package CentricToAll13.Multithreading.Threads;

public class Lab247 {

    public static void main(String[] args)
    {

        ThreadGroup threadGroup= new ThreadGroup("Employer");

        Employer e1= new Employer(threadGroup,"IT Industry");
        e1.start();

        Employer e2= new Employer(threadGroup,"Semiconductor Industry");
        e2.start();

        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


class Employer extends Thread{


    public Employer(ThreadGroup group, String name) {
        super(group, name);
    }

    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}