class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);

        return GCD(nums[0],nums[nums.length-1]);
    }
    public int GCD(int a,int b){
        if(b==0) return a;

        return GCD(b,a%b);
    }
}