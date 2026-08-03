class Solution {
    public int minEatingSpeed(int[] piles, int h) {

    int max = 0;
    for(int pile : piles){
        if(pile > max){
            max = pile;
        }
    }
    int low = 1;
    int high = max;
    int ans = max;

    while(low <= high){
        int mid = low + (high - low)/2;
        
        if(isPossible(piles,h,mid)){
            ans = mid;
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
    }
     return ans;   
    }
    static boolean isPossible(int[] piles,int h,int mid){

        long hours = 0;

        for(int pile:piles){
            hours += (pile + mid -1)/mid;
        }

        return hours <= h;
    }

}