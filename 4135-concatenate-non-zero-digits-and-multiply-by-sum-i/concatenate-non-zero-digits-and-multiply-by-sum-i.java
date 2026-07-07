class Solution {
    public long sumAndMultiply(int n) {

        long sum = 0;
       long p = 1;

       while(n>0){
           int digit = n % 10;
           if(digit!=0) {
               sum = sum + digit * p;
               p *=10;
           }
           n = n /10;
       }
       long n2 = sum;
       long sum1 =0;

       while (n2>0){
           int digit = (int)n2%10;
           sum1 += digit;
           n2 /= 10;
       }

       return sum * sum1;

    }
}