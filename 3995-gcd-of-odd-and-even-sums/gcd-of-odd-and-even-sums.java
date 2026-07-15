class Solution {
    public int gcdOfOddEvenSums(int n) {

        int Os = 0;
        int Es = 0;

         for(int i=0;i<=n;i++){
            Es += 2*i;
        }
        for(int i=0;i<n;i++){
            Os += 2*i + 1;
        }

        int g = GCD(Os,Es);

        return g;
    }
    public int  GCD(int x,int y){
        if(y==0){
            return x;
        }

        return GCD(y,x%y);
    }

}