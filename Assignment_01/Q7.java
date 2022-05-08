package Assignment_01;

public class Q7 {
    static int c = 0;
    static int d = 0;

    Q7() {
        c++;
    }

    void display() {
        d++;

    }

    public static void main(String[] args) {
        Q7 obj = new Q7();
        for (int i = 0; i < 4; i++) {
            Q7 obj1 = new Q7();
            obj.display();
        }
        System.out.println("No of count of objects calls: " + c);
        System.out.println("No of count of calling display function: " + d);
    }
}
