class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> st = new Stack<>();

        for(String value : operations){

            if(value.equals("C")){
                st.pop();
            }
            else if(value.equals("D")){
                int a = st.peek();
                st.push(2*a);

            }
            else if(value.equals("+")){
                int a = st.pop();
                int b = st.peek();

                st.push(a);
                st.push(a+b);
            }
            else{
                int num = Integer.parseInt(value);
                st.push(num);
            }
        }
        int score = 0;

        while(!st.isEmpty()){
            score += st.pop();
        }

        return score;
    }
}