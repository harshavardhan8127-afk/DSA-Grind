class Solution {
    public int maximumProduct(int[] nums) {
        int fm = Integer.MIN_VALUE;
        int sm = Integer.MIN_VALUE;
        int tm = Integer.MIN_VALUE;

        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;

        for(int num : nums){
            if(num > fm){
                tm = sm;
                sm = fm;
                fm = num;
            }
            else if (num > sm) {
                tm = sm;
                sm = num;
            }
            else if (num > tm) {
                tm = num;
            }

            //so if there are two large negative values then there
            //is chance of getting larger number
            if(num < m1){
                m2 = m1;
                m1 = num;
            }
            else if(num < m2){
                m2 = num;
            }
        }

        return Math.max(fm * sm * tm,fm * m1 * m2);
    }
}