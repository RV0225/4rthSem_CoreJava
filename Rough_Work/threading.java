package Rough_Work;

public class threading {

    public static void main(String args[]) throws Exception {
        sync s = new sync();

        Thread T1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    s.increment();
                }
            }
        });

        Thread T2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    s.increment();
                }
            }
        });

        Thread T3 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    s.increment();
                }
            }
        });

        Thread T4 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    s.increment();
                }
            }
        });
        Thread T5 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {

                    s.increment();
                }
            }
        });
        T1.start();
        T1.join();
        T2.start();
        T2.join();
        T3.start();
        T3.join();
        T4.start();
        T4.join();
        T5.start();
        T5.join();
        System.out.println(s.t1);
    }
}

class sync {
    StringBuffer t1 = new StringBuffer("java");

    public synchronized void increment() {
        t1.append("5");
    }
}