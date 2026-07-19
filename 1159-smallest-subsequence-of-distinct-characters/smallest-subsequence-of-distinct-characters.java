class Solution {
    public String smallestSubsequence(String s) {

        int[] freq = new int[26];
        boolean[] camed = new boolean[26];
        StringBuilder res = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch - 'a']--;
            if(camed[ch - 'a']){
                continue;
            }
            while(!st.isEmpty() && st.peek() > ch && freq[st.peek() - 'a'] > 0){
                camed[st.pop() - 'a'] = false;
            }
            st.push(ch);
            camed[ch - 'a'] = true;
        }

        for(char ch : st){
            res.append(ch);
        }

        return res.toString();
    }
}