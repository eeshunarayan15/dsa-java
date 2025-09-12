package Arrays.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");
        int size=Integer.parseInt(s[0]);
        int size2=Integer.parseInt(s[1]);
        int[][] arr = new int[size][size2];

        for (int i = 0; i < size; i++) {
        String[] s1 = bufferedReader.readLine().split(" ");
            for (int j = 0; j < size2; j++) {
             arr[i][j]=Integer.parseInt(s1[j]);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
