package CentricToAll13.Multithreading.SyncExample;

import java.util.ArrayList;

public class Lab255
{
    public static void main(String[] args){


        Sync a =new Sync();
        a.m1();
        a.m2();
        a.m3();
        a.m4();

//Synchronization at the method level
    }
}
class Sync {
    void m1() {
        synchronized (this.getClass()) {
            System.out.println("Default Object of Class will be locked!!");
        }
    }

    static void m2() {
        synchronized (Sync.class) {
            System.out.println("Default Object of Class will be locked!!");
        }
    }

    void m3() {
        synchronized (this) {
            System.out.println("Current Object of Class will be locked!!");
        }
    }

    void m4() {
        ArrayList a = new ArrayList();
        synchronized (a) {
            //thread 1 and thread 2 will not add to the a. They will add one by one
            System.out.println("Third Party Object of Class will be locked!!");
        }
    }


}