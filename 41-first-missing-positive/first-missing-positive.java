class Solution {
    public int firstMissingPositive(int[] nums) {

        int i = 0;

        while(i<nums.length){
            int crt = nums[i] - 1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i]!=nums[crt]){
                int temp = nums[i];
                nums[i] = nums[crt];
                nums[crt] = temp;
                }
            else{
                i++;
            }
        }

        for(int id=0;id<nums.length;id++){
            if(nums[id]!= id+1) return id+1;
        }
        
        return nums.length + 1;
    }
}