package unit_01;

public class P3_Task01_VariablesInJava {
    static int q = 10;
    int p = 11;

    public static void main(String[] args) {
        // valid declarations
        int a, b, c;
        float pi;
        double d;
        char e;

        typeconversionandtypecasting();
    }

    static void typeconversionandtypecasting() {
        double f;// 64 bits
        int i = 10;// 32 bits
        f = i;// Type Conversion
        System.out.println(f);

        double g = 10;// 64 bits
        int j;// 32 bits
        j = (int) g;// Type Casting
        System.out.println(i);
        System.out.println(j);
    }
}