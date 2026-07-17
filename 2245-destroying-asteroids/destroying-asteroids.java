class Solution {
    public boolean asteroidsDestroyed(int mass, int[] ast) {

        boolean gain = false;
        long NAG = mass;
        Arrays.sort(ast);

        for(int i=0;i<ast.length;i++){
            if(NAG >= ast[i]){
                NAG += ast[i];
                gain = true;
            }
            else{
                gain = false;
            }
        }

        return gain;
        
    }
}