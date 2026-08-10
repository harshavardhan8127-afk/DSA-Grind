class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int og = x;
        int sum = 0;
        int prod = 1;

        while(x>0){
            sum += x%10;
            x = x/10;
        }
        
        return (og%sum == 0) ? sum : -1;
    }
}