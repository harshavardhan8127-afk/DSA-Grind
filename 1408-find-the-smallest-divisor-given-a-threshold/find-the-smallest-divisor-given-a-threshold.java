class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int max = 0;
        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        
        int low = 1;
        int high = max;
        int ans = max;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(isPossible(nums,threshold,mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
    }
    static boolean isPossible(int[] nums,int threshold,int mid){

        long sum = 0;

        for(int num: nums){
            sum += (num + mid - 1)/mid; // we also can use (int) Math.ceil((double) num/mid) but this can overflow
        }

        return sum <= threshold;
    }
}