package Arrays.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] s = bf.readLine().split(" ");
        int val1=Integer.parseInt(s[0]);
        int val2=Integer.parseInt(s[1]);
        System.out.println(val1 +"    "+ val1);
        int[] arr = new int[val1];
        String[] split = bf.readLine().split(" ");
        for(int i=0;i<val1;i++){
            arr[i]=Integer.parseInt(split[i]);
        }
        System.out.println(Arrays.toString(arr));

    }
}
