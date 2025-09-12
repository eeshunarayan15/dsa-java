package LinearSearch.example1;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits1295 {
    public static void main(String[] args) {
//        int arr[]={12,345,2,6,7896};
//        int res= findNumbers(arr);
//        System.out.println(res);
////        even(1764);
        System.out.println(digits2(-55555554));
    }

    private static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(digits(num)){
                count++;
            }
        }
        return count;
    }

    private static boolean digits(int num) {
        if(num<0)
            num=num*-1;
        if(num==0){
            return false;
        }
        int count=0;
        while (num>0){
            count++;
            num=num/10;


        }

        if(count%2!=0){
            return false;
        }
        return  true;
    }
 static int digits2(int num) {
     if(num<0)
         num=num*-1;
     if(num==0){
         return 1;
     }
      return  (int) (Math.log10(num)+1);
    }
}
