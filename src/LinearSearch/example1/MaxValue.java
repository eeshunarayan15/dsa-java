package LinearSearch.example1;

public class MaxValue {
    public static void main(String[] args) {

        int arr [][]={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int max = max(arr);
        System.out.println(max);
    }
    private static int max(int[] []arr) {
        if(arr.length==0){
            return -1;
        }
        int max=Integer.MIN_VALUE;
       for(int row=0;row<arr.length;row++){
           for(int col=0;col<arr[row].length;col++){
               if(arr[row][col]>max){
                   max=arr[row][col];
               }
           }
       }
        return max;
    }
}
