class Solution {
    public int triangularSum(int[] nums) {

        return tri(nums,nums.length);        
    }
    int tri(int[] nums,int n){
        if(n==1) return nums[0];

        for(int i=0;i<n-1;i++){
            nums[i]=(nums[i]+nums[i+1])%10;
        }
        return tri(nums,n-1);
    }
}