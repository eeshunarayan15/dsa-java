package cycleSort;

import java.util.ArrayList;
import java.util.List;
class Leetcode442 {
    public List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                list.add(nums[i]);
            }
        }
        return list;

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