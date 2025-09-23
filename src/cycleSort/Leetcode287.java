package cycleSort;

import java.util.*;
class Leetcode287 {
    public int findDuplicate(int[] nums) {
        
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return nums[index];
            }
        }
        return 0;
    }
    void cyclicSort(int [] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
    }
    void swap(int [] nums ,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}