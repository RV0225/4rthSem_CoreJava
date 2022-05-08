package Assignment_01;

public class Q4 {
    public static void main(String[] args) {

        classThree obj = new classThree(1);
        classThree obj1 = new classThree();
    }
}

class classOne {
    classOne(int n) {
        System.out.println("Inside ClassOne :");
    }
}

class classTwo extends classOne {
    classTwo() {
        super(1);
        System.out.println("Inside ClassTwo:");
    }

}

class classThree extends classTwo {
    classThree() {
        System.out.println("Inside ClassThree: ");
    }

    classThree(int n) {
        System.out.println("Inside ClassThree Parameterized Constructor:");

    }

}
