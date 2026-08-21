class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {

         int occur = 0;

        for (int num : nums) {
            int n = num;
            while (n > 0) {
                int d = n % 10;
                if (d == digit) occur++;
                n = n / 10;
            }
        }
        return occur;
    }
}