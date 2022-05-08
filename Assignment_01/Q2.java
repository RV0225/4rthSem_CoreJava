package Assignment_01;

public class Q2 {
    static int c = 0;

    Q2() {
        c++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Q2 obj = new Q2();
        }
        System.out.println("No of calls from objects are: " + c);
    }
}
