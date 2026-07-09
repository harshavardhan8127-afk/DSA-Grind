class Solution {
    public int sumOfPrimesInRange(int n) {

       int l = n;
       int s = 0;
       while(n>0){
        int d = n%10;
        s = s * 10 + d;
        n = n/10;
       }
       int r = s;

       int sum = 0;
       for(int i=Math.min(l,r);i <= Math.max(l,r);i++){
        if(isPrime(i)){
            sum += i;
        }
       }
       return sum;       
    }
    static boolean isPrime(int n){
        if(n <= 1) return false;

        for(int i=2;i*i <=n;i++){
            if(n%i == 0){
                return false;
            }
        }


        return true;
    }
}