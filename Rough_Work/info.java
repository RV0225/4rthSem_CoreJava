package Rough_Work;

public class info {
    void reverse(char s[], int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    public static void main(String[] args) {
        info in = new info();
        String s = "Today is a Sunnny Day";
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                int j = i;
                while (j + 1 < c.length && c[j + 1] != ' ') {
                    j++;
                }
                in.reverse(c, i, j);
                i = j;
            }
        }
        for (int l = 0; l < c.length; l++) {
            System.out.print(c[l]);
        }
    }
}
