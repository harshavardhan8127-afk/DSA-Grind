class Solution {
    public int maximumCandies(int[] candies, long k) {

        int max = 0;
        for(int num : candies){
            if(num > max){
                max = num;
            }
        }
        
        int low = 1;
        int high = max;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            //Maximum means we have use the upperbound logic
            if(isPossible(candies,k,mid)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] candies,long k,int mid){

        long children = 0;

        for(int num : candies){
            children += num/mid;
        }

        return children >= k;
    }
}