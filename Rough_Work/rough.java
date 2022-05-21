package Rough_Work;

import java.util.*;

public class rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        sc.nextLine();
        int arr[] = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println(optimal(arr, x));

        sc.close();
    }

    static int optimal(int arr[], int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        while (pq.size() > 1) {
            int temp = pq.poll() + pq.poll();
            count += temp;
            pq.add(temp);
        }
        return count;
    }
}
