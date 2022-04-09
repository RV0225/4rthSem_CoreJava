package unit_01;

import java.util.Vector;
import java.util.*;

/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 2, 3, 6 };

		QuestionsOnArray obj = new QuestionsOnArray();
		// obj.sortAnArray(array);
		// obj.findTheDuplicateElements(array);
		// obj.findSecondLargestAndSecondSmallestElement(array);
		// obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {
		int min, j;
		for (int i = 1; i < arr.length; i++) {
			min = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > min) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = min;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	void findTheDuplicateElements(int[] arr) {
		int n = arr.length;
		int c;
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 0; i < n; i++) {
			c = 0;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					c++;
					break;
				}

			}
			if (c != 0) {
				v.add(arr[i]);
			}
		}
		System.out.println(v);
	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		int max = arr[0];
		int sec_max = arr[1];
		int min = arr[0];
		int sec_min = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				sec_max = max;
				max = arr[i];
			} else if (arr[i] > sec_max && arr[i] != max) {
				sec_max = arr[i];
			}
			if (arr[i] < min) {
				sec_min = min;
				min = arr[i];
			} else if (arr[i] < sec_min && arr[i] != min) {
				sec_min = arr[i];
			}
		}

		System.out.println("Second Largest Element is : " + sec_max);
		System.out.println("Second Smallest Element is : " + sec_min);
	}

	void leftRotationInAnArray(int[] arr) {
		int k;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no of left shifts to do : ");
		k = obj.nextInt();
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		reverse(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	void reverse(int arr[], int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	void removeElementInArray(int[] arr) {
		int loc;
		System.out.println("Enter the location for deletion of element: ");
		Scanner obj = new Scanner(System.in);
		loc = obj.nextInt();
		for (int i = loc; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
	}

}
