

import java.util.*;
import java.util.ArrayList;
public class findallduplicates
 {
    
        public static void main(String []args){
            int nums[]={4,3,2,7,8,2,3,1};
    
            List list=findDuplicates(nums);
            System.out.print(Arrays.toString(list.toArray()));
        }
        public static List<Integer> findDuplicates(int[] nums) {
            int index=0;
            while(index<nums.length) {
                if(nums[nums[index]-1]!=nums[index] ){
                    int temp=nums[nums[index]-1];
                    nums[nums[index]-1]=nums[index];
                    nums[index]=temp;
                }
                else{
                    index++;
                }
            }
            List<Integer> list=new ArrayList<>(); 
            for(int i=0;i<nums.length;i++){
                if(nums[i]-1!=i){
                    list.add(nums[i]);
                }
            }
            return list;
        
    }
    
 }
    
//leetcode 442
