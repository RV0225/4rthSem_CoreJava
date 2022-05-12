package Unit_03;

import java.util.*;

public class P14_Exception_Handling {
    public static void main(String[] args) {
        ExceptClass obj = new ExceptClass();
        // obj.basicException();
        obj.handleException();
        obj.mutlipleCatch();
        obj.indexoutofBond();
        obj.inputMismatch();
        obj.nullPointer();
        obj.stackOverflow();
    }
}

class ExceptClass {
    void basicException() {
        int a = 100000 / 0;
        System.out.println(a);
    }

    void handleException() {
        try {
            int a = 1000 / 0;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void mutlipleCatch() {
        try {
            int i = Integer.parseInt("tommy");

        } catch (NumberFormatException nfe) {
            System.out.println("can't make an int out of string");
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void inputMismatch() {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            System.out.println(n);

        } catch (InputMismatchException ime) {
            System.out.println(ime.getMessage());
        }
        sc.close();
    }

    void stackOverflow() {
        int a = 2;
        try {
            while (a > 0) {
                a++;
            }
        } catch (StackOverflowError soe) {
            System.out.println(soe.getMessage());
        }
    }

    void indexoutofBond() {
        try {
            int arr[] = new int[3];
            arr[10] = 78;
        } catch (IndexOutOfBoundsException ie) {
            System.out.println(ie.getMessage());
        }
    }

    void nullPointer() {

        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}