package Assignment_01;

import java.util.*;

public class Q5 {
    String name;
    int age;
    String department[] = new String[] { "A", "B", "C", "D" };
    int s;
    String dp;
    static int a = 0, b = 0, c = 0, d = 0;

    Q5(String n, int ag, int sal, String dep) {
        this.name = n;
        this.age = ag;
        this.dp = dep;
        this.s = sal;
        if (department[0].equals(dp)) {
            a += s;
        }
        if (department[1].equals(dp)) {
            b += s;
        }
        if (department[2].equals(dp)) {
            c += s;
        }
        if (department[3].equals(dp)) {
            d += s;
        }
    }

    static void show() {
        System.out.println("Income of Department A:" + a);
        System.out.println("Income of Department B:" + b);
        System.out.println("Income of Department C:" + c);
        System.out.println("Income of Department D:" + d);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the name of Employee: ");
            String n = sc.nextLine();
            System.out.println("Enter the age: ");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the department name: ");
            String d = sc.nextLine();
            System.out.println("Enter the salary: ");
            int s = sc.nextInt();
            sc.nextLine();
            Q5 obj = new Q5(n, a, s, d);
        }
        show();
    }
}
