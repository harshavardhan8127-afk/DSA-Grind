class Solution {
    public int missingNumber(int[] nums) {

        int i=0;
        while(i<nums.length){
            int crt = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[crt]){
                int temp = nums[i];
                nums[i] = nums[crt];
                nums[crt] = temp;
            }
            else{
                i++;
            }
        }

            for(int id=0;id<nums.length;id++){
                if(nums[id]!= id) return id;
            }

        
        return nums.length;
    }
}