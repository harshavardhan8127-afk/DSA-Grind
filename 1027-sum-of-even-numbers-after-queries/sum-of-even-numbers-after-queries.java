class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

        int[] res = new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int val = queries[i][0];
            int ind = queries[i][1];
            int sum = 0;
            nums[ind] = nums[ind] + val;

            for(int j=0;j<nums.length;j++){
                if(nums[j]%2==0){
                    sum += nums[j];
                }
            }
            res[i] = sum;
        }

        return res;
        
    }
}