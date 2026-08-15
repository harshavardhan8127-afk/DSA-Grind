class Solution {
    public boolean areOccurrencesEqual(String s) {

        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        int fcount = 0;

        for(int i=0;i< freq.length; i++){
            if(freq[i] > 0){
                if(fcount == 0){
                    fcount = freq[i];
                }
                else if (fcount != freq[i]) {
                    return false;
                }
            }
        }
        return true;   
    }
}