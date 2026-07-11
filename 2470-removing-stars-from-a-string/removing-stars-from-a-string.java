class Solution {
    public String removeStars(String s) {


        StringBuilder res = new StringBuilder();

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch != '*'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        for(char c : st){
            res.append(c);
        }

        return res.toString();
    }
        
    }
