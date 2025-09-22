package insertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 4, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }

            }

        }
    }
    private static void swap(int[] arr, int first, int last) {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
}
