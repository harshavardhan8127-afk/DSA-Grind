class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int max = 0;
        int sum = 0;
        for(int num : weights){
            if(num > max){
                max = num;
            }
            sum += num;
        }

        int low = max;
        int high = sum;
        int ans = sum;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(isPossible(weights,days,mid)){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] weights,int days,int mid){

        long day = 1;
         int load = 0;

         for(int w : weights){
            if(load + w <= mid){
                load += w;
            }
            else{
                day++;
                load = w;
            }
         }

         return day <= days;
    }
}