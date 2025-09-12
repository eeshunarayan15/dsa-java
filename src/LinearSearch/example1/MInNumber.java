package LinearSearch.example1;

public class MInNumber {
    public static void main(String[] args) {
        int[] arr = {33,5,54,-2,-1,44,9,6};
        int res=min(arr);
        System.out.println(res);

    }

    private static int min(int[] arr) {
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            System.out.println(min+" "+i);
            if(arr[i]<min){

                min=arr[i];

            }
            }
        return min;
        }
    }



