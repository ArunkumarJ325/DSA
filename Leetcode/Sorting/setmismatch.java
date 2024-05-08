public class setmismatch {
    
        public int[] findErrorNums(int[] nums) {
            int[] res = new int[2];
            int index = 0;
            while (index < nums.length) {
        
                    if (nums[nums[index] - 1] != nums[index]) {
                        int temp = nums[nums[index] - 1];
                        nums[nums[index] - 1] = nums[index];
                        nums[index] = temp;
                    } 
                    else {
                        index++;
                    }
                
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=i+1){
                    res[0]=nums[i];
                    res[1]=i+1;
                }
            }
            return res;
        }
    }

//leetcode 645