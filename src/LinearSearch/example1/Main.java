package LinearSearch.example1;

public class Main {
    public static void main(String[] args) {
        int arr []={11,22,44,55,51,21,96,244};

        int res=linearSearch(arr,11);
        System.out.println(res);
    }

    private static int linearSearch(int[] arr, int target) {
        if(arr.length==0){
            return  -1;
        }
        for(int index=0;target<arr.length;index++){
            if(arr[index]==target){
                return  index;
            }
        }
        return  -1;
    }
}
