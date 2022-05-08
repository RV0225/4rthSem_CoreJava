package Assignment_01;

public class Q8 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        for (int i = 0; i < arr.length; i++) {
            if (i == 3) {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
