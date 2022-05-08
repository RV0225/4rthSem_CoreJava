package Assignment_01;

public class Q9 {
    public static void main(String[] args) {
        B obj = new B();
        // System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
    }

}

class A {
    private int x = 10;
    public int y = 11;
    protected int z = 12;
}

class B extends A {

}