package Unit_03;

import java.util.*;

public class P16_MultiThreading_Multitasking {

    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t = new T2();

        t1.start();
        t.start();
        // C1 c1 = new C1();
        // C2 c2 = new C2();
        // c1.show1();
        // c2.show2();
    }
}

class C1 {
    void show1() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x);
        System.out.println("inside show1");
        sc.close();
    }
}

class C2 {
    void show2() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
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
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }
}