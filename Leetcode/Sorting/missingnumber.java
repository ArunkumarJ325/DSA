class missingnumber {
    public int missingNumber(int[] nums) {
        int index=0;
        while(index<nums.length){
            if(nums[index]<nums.length && nums[index]!=index ){
                int temp=nums[nums[index]];
                nums[nums[index]]=nums[index];
                nums[index]=temp;
            }
            else{
                index++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i) return i;

        }
        return nums.length;
        
    }
}
//leetcode 268