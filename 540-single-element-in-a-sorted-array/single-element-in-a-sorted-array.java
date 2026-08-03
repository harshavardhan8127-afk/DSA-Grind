class Solution {
    public int singleNonDuplicate(int[] nums) {

        
        // int xor = 0;
        // for(int i=0;i<nums.length;i++){
        //     xor ^= nums[i];
        // }
        // return xor;
        // This solutins works buts it need the TC of O(nlogn) which is binary search

        int l = 0;
        int r = nums.length - 1;

        while(l<r){
            int mid = l + (r-l)/2;
            if(mid%2 == 0 && nums[mid] == nums[mid+1] || (mid %2 == 1 && nums[mid] == nums[mid - 1])){
                l = mid + 1;
            }
            else r = mid;
            
        }
        return nums[l];
    }
}