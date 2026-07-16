class Solution {
    public long gcdSum(int[] nums) {


        int[] perfectGCD = new int[nums.length];

        int mx = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            mx = Math.max(mx,nums[i]);
            perfectGCD[i] = GCD(nums[i],mx);
        }
        Arrays.sort(perfectGCD);
        System.out.println(Arrays.toString(perfectGCD));


        long sum = 0;
        int l = 0;
        int r = perfectGCD.length - 1;

        while(l<r){
            if(perfectGCD[l]!=perfectGCD[r]){
                int x = GCD(perfectGCD[l],perfectGCD[r]);
                sum += x;
            }
            else{
                int y = GCD(perfectGCD[l],perfectGCD[r]);
                sum += y;
            }

            l++;
            r--;

        }
        return sum;
        
    }
    public int GCD(int x,int y){
        while (y!=0){
            int temp = y;
            y = x%y;
            x = temp;
        }

        return x;
    }
}