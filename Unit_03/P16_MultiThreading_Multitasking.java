package Unit_03;

import java.util.*;

public class P16_MultiThreading_Multitasking {

    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t = new T2();

        t1.start();
        t.start();
    }
}

class T1 extends Thread {
    public void run() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
        sc.close();
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}