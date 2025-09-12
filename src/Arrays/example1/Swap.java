package Arrays.example1;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int arr[]={2,4,5,9,5,3};
        swap(arr,0,4);
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp=arr[i];
        arr[i]=arr[i1];
        arr[i1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
