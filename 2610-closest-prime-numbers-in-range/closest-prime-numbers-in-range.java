class Solution {
    public int[] closestPrimes(int left, int right) {

        List<Integer> prime = new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                prime.add(i);
            }
        }
        if(prime.size() < 2) return new int[]{-1,-1};

        int minDiff = Integer.MAX_VALUE;
        int p1 = -1;
        int p2 = -1;
        for(int i=0;i<prime.size()-1;i++){
            int d = prime.get(i+1) - prime.get(i);
            if(d < minDiff){
                minDiff = d;
                p1 = prime.get(i);
                p2 = prime.get(i+1);
            }
        }
        return new int[]{p1,p2};
    }
    static boolean isPrime(int n){
        if(n<=1) return false;

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}