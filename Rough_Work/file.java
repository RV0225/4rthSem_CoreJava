package Rough_Work;

import java.io.*;
import java.util.*;

public class file {
    StringBuffer s = new StringBuffer("Hello");

    public static void main(String[] args) throws Exception {
        file f = new file();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    f.s.append("Hello");
                    System.out.println(f.s);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                }
            }
        });
        t1.start();
        t1.join();
        t2.start();

    }
}
