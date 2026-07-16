class Solution {
    public long gcdSum(int[] nums) {


        int[] perfectGCD = new int[nums.length];

        int mx = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
            perfectGCD[i] = GCD(nums[i],mx);
        }
        Arrays.sort(perfectGCD);
      
        long sum = 0;
        int l = 0;
        int r = perfectGCD.length - 1;

        while(l<r){
            sum += GCD(perfectGCD[l],perfectGCD[r]);
            l++;
            r--;

        }
        return sum;
        
    }
    public int GCD(int x,int y){
       if(y==0){
        return x;
       }

       return GCD(y,x%y);
    }
}