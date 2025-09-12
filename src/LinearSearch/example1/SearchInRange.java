package LinearSearch.example1;

public class SearchInRange {
    public static void main(String[] args) {
        int arr []={11,22,44,55,51,21,96,244};
        int search = search(arr, 1, 6, 21);
        System.out.println(search);
    }
    static  int search(int [] arr,int start,int end, int target){
        if(arr.length==0){
            return  -1;
        }

        for(int index=start;index<end;index++){
            if(arr[index]==target){
                return  index;
            }
        }
        return  -1;
    }
}
