class Solution {
    public int maximumLengthSubstring(String s) {

        //calculate the frequency of each char
        int[] freq = new int[26];

        int left = 0;
        int maxLen = 0;

        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);
            freq[ch - 'a']++;
            while(freq[ch - 'a'] > 2){
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            //now calculate the length
            maxLen = Math.max(maxLen,right - left + 1);
        }
        return maxLen;
    }
}