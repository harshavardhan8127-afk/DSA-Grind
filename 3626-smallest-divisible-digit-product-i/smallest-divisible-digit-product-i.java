class Solution {
    public int smallestNumber(int n, int t) {

        int small = Integer.MAX_VALUE;

        for(int i=n;i<=n+10;i++){
            if(product(i)%t == 0){
                small = Math.min(small,i);
            }
        }

        return small;
    }
    static int product(int n){
        int prod = 1;
        while(n>0){
            int rem = n%10;
            prod *= rem;
            n /= 10;
        }
        return prod;
    }
}