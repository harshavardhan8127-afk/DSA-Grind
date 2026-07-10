class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;
        int[] Lsum = new int[n];
        int[] Rsum = new int[n];

         Rsum[0] = nums[0];
        for(int i=1;i< n;i++){
            Rsum[i] = Rsum[i-1] + nums[i];
        }

        Lsum[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            Lsum[i] =  Lsum[i+1] + nums[i];
        }

        for(int i=0;i< nums.length;i++){
            if(Lsum[i]==Rsum[i]){
                return i;
            }
        }
        return -1;
    }
}