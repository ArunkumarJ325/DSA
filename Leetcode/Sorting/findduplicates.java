public class findduplicates{
    
        public int findDuplicate(int[] nums) {
            int index=0;
            while(index<nums.length){
                if(nums[index]!=index+1){
                if(nums[nums[index]-1]!=nums[index]){
                   int temp=nums[nums[index]-1];
                    nums[nums[index]-1]=nums[index];
                    nums[index]=temp;
                }
                else{
                    return nums[index];
                }
                }
                else{
                    index++;
                }
            }
            
            return nums.length;
            
        }
    }

//leetcode287