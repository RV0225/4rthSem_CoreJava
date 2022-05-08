package Assignment_01;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Testclass obj = new Testclass();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        obj.display(n);
        sc.close();
    }

}

interface In1 {
    void display(int n);
}

class Testclass implements In1 {
    public void display(int n) {
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
