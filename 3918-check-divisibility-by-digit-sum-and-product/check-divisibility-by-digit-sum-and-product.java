class Solution {
    public boolean checkDivisibility(int n) {
       
        return n % (hehe1(n) + hehe2(n)) == 0;
    }
    static int hehe1(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    static int hehe2(int n){
        int prod = 1;
        while(n>0){
            prod *= n%10;
            n /= 10;
        }
        return prod;
    }
}