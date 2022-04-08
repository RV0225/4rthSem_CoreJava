package unit_01;

public class P6_Task02_StringsInJava {
    public static void main(String[] args) {
        StringInjava obj = new StringInjava();
        obj.StringDefinition();
        obj.charAndString();
    }
}

class StringInjava {
    void StringDefinition() {
        String s = "Hello There!";
        String s1 = new String("abcdefgu");
        System.out.println(s);
        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        String first = "Ranvir";
        String second = "Singh";
        String third = first + second;// Add two Strings
        System.out.println(third);
        boolean result = first.equals(second);// Compare two Strings
        System.out.println(result);
        String fourth = "Ranvir";
        String fifth = new String("Singh!");
    }

    void charAndString() {
        char[] ch = { 'H', 'e', 'l', 'o', ' ', 'T', 'h', 'e', 'r', 'e', '!' };
        char[] ch2 = { '!', '!' };
        System.out.println(ch);
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        String s1 = new String(ch);
        System.out.println(s1);
        ch[0] = 'h';
        s1 = s1 + 'a';
        String s2 = "Geeks";
        char[] ch4 = s2.toCharArray();
        char[] a2 = { 'A', 'K', 'A' };
        String s3 = new String(a2);
    }
}
