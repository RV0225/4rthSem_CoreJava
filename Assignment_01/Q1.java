package Assignment_01;

import java.util.*;

public class Q1 {
    String name;
    String section = "A";
    int age;
    float percentage;
    static int no = 0;
    static float av = 0;

    Q1(String n, int a, float per) {
        this.name = n;
        this.age = a;
        this.percentage = per;
        no++;
        av += percentage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the name of " + (i + 1) + " student ");
            String n = sc.nextLine();
            System.out.println("Enter the age of " + (i + 1) + " student ");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the percentage of " + (i + 1) + " student ");
            float p = sc.nextFloat();
            sc.nextLine();
            Q1 obj = new Q1(n, a, p);
        }
        System.out.println("Average percentage of Students in Section A: " + av / no);
        sc.close();
    }
}
