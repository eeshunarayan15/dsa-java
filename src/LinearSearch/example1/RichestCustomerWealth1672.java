package LinearSearch.example1;

public class RichestCustomerWealth1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        int res=maximumWealth(accounts);
        System.out.println(res);

    }
    public static int maximumWealth(int[][] accounts) {
        int maxSum=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum=sum+accounts[person][account];

            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;

    }
}
