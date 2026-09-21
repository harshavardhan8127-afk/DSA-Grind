class Solution {
    public int alternatingSum(int[] nums) {

        int Esum = 0;
        int Osum = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) Esum+=nums[i];
            if(i%2!=0) Osum+=nums[i];
        }
        return Esum - Osum;
    }
}