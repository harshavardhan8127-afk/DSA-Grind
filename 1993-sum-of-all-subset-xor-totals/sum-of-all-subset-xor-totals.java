class Solution {
    public int subsetXORSum(int[] nums) {

        return helper(nums,0,0);
    }
    static int helper(int[] nums,int index,int xor){

        if(index == nums.length){
            return xor;
        }

        //Taking it
        int left = helper(nums,index+1,xor ^ nums[index]);

        //Not taking it
        int right = helper(nums,index+1,xor);

        return left+right;
    }
}