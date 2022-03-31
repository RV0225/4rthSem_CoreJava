package unit_01;

public class P3_Task02_OperatorsInJava {
    public static void main(String[] args) {
        OperatorInJava obj = new OperatorInJava();
        obj.UnaryOperator();
        obj.ArithmeticOperator();
        obj.ShiftOperator();
        obj.RelationalOperator();
        obj.BitwiseAndLogicalOperator();
        obj.ternaryOperator();
        obj.AssignmentOperator();
    }
}

class OperatorInJava {
    void UnaryOperator() {
        int a = 10;
        boolean b = false;
        System.out.println("Inside UnaryOperator");
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        System.out.println(--a);
        // Bitwise Compliment(~)
        System.out.println(~a);
        // "Not" Operator(!)
        System.out.println(!b);
        System.out.println("\n");
    }

    void ArithmeticOperator() {
        System.out.println("InsideArithmeticOperator");
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2);
        System.out.println("\n");
    }

    void ShiftOperator() {
        System.out.println("Inside ShiftOperator");
        System.out.println(10 << 2);
        System.out.println(10 << 3);
        System.out.println(20 << 2);
        System.out.println(15 << 4);
        System.out.println(10 >> 2);
        System.out.println(20 >> 2);
        System.out.println(20 >> 3);
        System.out.println("\n");
    }

    void RelationalOperator() {
        System.out.println("Inside RelationalOperator");
        int a = 10;
        int b = 20;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println("\n");
    }

    void BitwiseAndLogicalOperator() {
        System.out.println("Inside BitwiseAndLogicalOperators");
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a++ < c);
        System.out.println(a);
        System.out.println(a < b && a++ < c);
        System.out.println(a);
        System.out.println(a > b || a < c);
        System.out.println(a > b | a < c);
        System.out.println(a > b || a++ < c);
        System.out.println(a);
        System.out.println(a > b | a++ < c);
        System.out.println(a);
        System.out.println("Bitwise Inclusive OR:" + (12 | 12));
        System.out.println("Bitwise Exclusive OR:" + (12 ^ 12));
        System.out.println("\n");

    }

    void ternaryOperator() {
        System.out.println("Inside ternary Operator");
        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b;
        System.out.println(min);
        System.out.println("\n");
    }

    void AssignmentOperator() {
        System.out.println("Inside Assignment Operator");
        int b = 8;
        b >>>= 2;
        System.out.println(b);
        int a = 10;
        a += 3;
        System.out.println(a);
        a -= 4;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        System.out.println("\n");

    }
}
