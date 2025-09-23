package cycleSort;

import java.util.Arrays;

public class Leetcode268 {
    public static void main(String[] args) {
        int arr[] = {3, 0, 2, 1};
//        int res=missingNumber(arr);
        int res = cyclicSort(arr);
        System.out.println(res);
    }


    static int missingNumber(int[] arr) {
        return 1;
    }

    static int cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int corrrect = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[corrrect]) {
                swap(arr, i, corrrect);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
