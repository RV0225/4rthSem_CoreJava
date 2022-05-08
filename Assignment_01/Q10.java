package Assignment_01;

import java.util.*;

public class Q10 {
    String model[] = new String[] { "Maruti", "Zen_astlo", "Wagnor", "Swift" };
    static int ct[][] = new int[4][4];
    String md;
    String cti;
    String cty[] = new String[] { "Delhi", "Mumbai", "Chennai", "Kolkata" };

    Q10(String c, String m) {
        this.md = m;
        this.cti = c;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (cty[i].equals(cti)) {
                    if (model[j].equals(md)) {
                        ct[i][j] += 1;
                    }
                }
            }

        }
    }

    static void show() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ct[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Q10 arr[] = new Q10[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the city: ");
            String c = sc.nextLine();
            System.out.println("Enter the model of car:");
            String m = sc.nextLine();
            arr[i] = new Q10(c, m);
        }
        show();
        sc.close();
    }
}
