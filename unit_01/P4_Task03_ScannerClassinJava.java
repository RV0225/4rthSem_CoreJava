package unit_01;

import java.util.Scanner;

public class P4_Task03_ScannerClassinJava {
    public static void main(String[] args) {
        Scanner myobj1 = new Scanner(System.in);
        Scanner myobj2 = new Scanner(System.in);
        String firstname = myobj1.next();
        System.out.println("Name is : " + firstname + "\n");
        String name = myobj2.nextLine();
        String name2 = myobj2.nextLine();
        System.out.println("Name is: " + name + "\n");
        System.out.println("Name is: " + name2 + "\n");
        boolean b = myobj2.nextBoolean();
        System.out.println(b + "\n");
        myobj1.close();
        myobj2.close();
    }
}
