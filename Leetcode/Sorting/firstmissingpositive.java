class firstmissingpositive {
    public int firstMissingPositive(int[] nums) {
        int index=0;
        while(index<nums.length){
            if(nums[index]>0 && nums[index]<nums.length && nums[nums[index]-1]!=nums[index]){
                int temp=nums[nums[index]-1];
                nums[nums[index]-1]=nums[index];
                nums[index]=temp;
            }
            else{
                index++;
            }

        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}

//Leetcode 41