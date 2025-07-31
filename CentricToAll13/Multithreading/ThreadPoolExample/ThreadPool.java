package CentricToAll13.Multithreading.ThreadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool
{
            public static void main(String[] args) {
                 mythread mt=new mythread();
                ExecutorService exService1= Executors.newFixedThreadPool(1);
                for(int i=1;i<=2;i++)
                    exService1.execute(mt);
                ExecutorService exService2= Executors.newFixedThreadPool(2);
                for(int i=1;i<=2;i++)
                    exService2.execute(mt);

                exService1.shutdown();
                exService2.shutdown();
            }


        }

        class  mythread extends Thread{
            public void run(){
                Thread t1=Thread.currentThread();
                for(int i=1;i<=2;i++){
                    System.out.println(i +" worked and displayed by "+ t1.getName() );
                    try{
                        Thread.sleep(1000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        }



