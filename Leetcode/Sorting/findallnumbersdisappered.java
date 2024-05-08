import java.util.ArrayList;
import java.util.List;

public class findallnumbersdisappered {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int index=0;
        List<Integer> list=new ArrayList<>();
        while(index<nums.length){
            if(nums[nums[index]-1]!=nums[index]){
                int temp=nums[nums[index]-1];
                nums[nums[index]-1]=nums[index];
                nums[index]=temp;
            }
            else index++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1!=i){
                list.add(i+1);
            }
        }
        return list;
        
    }
}
//leetcode 448
