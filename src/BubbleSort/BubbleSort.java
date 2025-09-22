package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        boolean swapped;
        //run  the steps for n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            swapped=false;
//       for each step , max item will come to the last respective index
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped=true;
                }
            }
            // if you did not swap for a particular value of i , it means the array is sorted hence stop the loop
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
