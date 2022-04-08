package unit_01;

public class P6_Task03_StringBufferClassInJava {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("Java");
        System.out.println(sb.charAt(0));
        System.out.println(sb);
        StringBuffer sb2 = new StringBuffer("Hello");
        sb2.insert(1, "Java");
        System.out.println(sb2);
        StringBuffer sb3 = new StringBuffer("Hello");
        sb3.replace(1, 3, "Java");
        System.out.println(sb3);
        StringBuffer sb4 = new StringBuffer("Hello");
        sb4.delete(1, 3);
        System.out.println(sb4);

    }
}
