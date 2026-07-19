class Solution {
    public String removeDuplicateLetters(String s) {

        int[] freq = new int[26];
        boolean[] came = new boolean[26];
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch - 'a']--;
            if(came[ch - 'a']){
                continue;
            }
            while(!st.isEmpty() && st.peek() > ch && freq[st.peek() - 'a'] > 0){
                came[st.pop() - 'a'] = false;
            }
            st.push(ch);
            came[ch - 'a'] = true;
        }

        for(char ch : st){
            res.append(ch);
        }
        
        return res.toString();
    }
}