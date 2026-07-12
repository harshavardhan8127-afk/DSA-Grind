class Solution {
    public int[] asteroidCollision(int[] ast) {

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<ast.length;i++){
            if(st.isEmpty()){
                st.push(ast[i]);
            }
            else if(ast[i] > 0 && st.peek()>0){
                st.push(ast[i]);
            }
            else if(ast[i] < 0 && st.peek()<0){
                st.push(ast[i]);
            }
            else if(ast[i] < 0 && st.peek()>0){
                int curr = ast[i];
                boolean alive = true;
                while(!st.isEmpty() && st.peek()>0 && curr<0){
                    if(Math.abs(st.peek())>Math.abs(curr)){
                        alive = false;
                        break;
                    }
                    else if(Math.abs(st.peek()) == Math.abs(curr)){
                        alive = false;
                        st.pop();
                        break;
                    }
                    else{
                        st.pop();
                    }
                }
                  if(alive){
                        st.push(ast[i]);
                    }
            }
            else{
                st.push(ast[i]);
            }
        }

        int[] res = new int[st.size()];

        for(int i=st.size() - 1;i>=0;i--){
            res[i] = st.pop();
        }

        return res;
    }
}