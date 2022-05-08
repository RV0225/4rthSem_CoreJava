package Assignment_01;

import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        int result = (x > y) ? sum(x, y) : sub(x, y);
        System.out.println(result);
        sc.close();
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        int c = a - b;
        if (c > 0) {
            return c;

        } else {
            return 0;
        }
    }
}
