package unit_01;

public class P6_Task01_ArraysInJava {
    public static void main(String[] args) {
        int array[];
        int[] array1;
        int[] array2;
        array = new int[6];
        for (int i = 0; i < array.length; i++)
            array[i] = i;
        int array3[] = { 33, 3, 4, 5 };

        arrayAsParameter(array3);
        arrayAsParameter(new int[] { 33, 3, 4, 5 });
        int[] array4 = arrayAsReturnType();
        System.out.println(array4.toString());
        int arr[] = { 50, 60, 70, 80 };
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[][] arr5 = new int[3][3];
        for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
            System.out.println(arr5[i][j]);
        }
        int counter = 0;
        for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
            counter++;
            arr5[i][j] = counter;
        }
        for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
            System.out.println(arr5[i][j]);
        }

    }

    static void arrayAsParameter(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int[] arrayAsReturnType() {
        int array3[] = { 33, 3, 4, 5 };
        return array3;
    }
}
