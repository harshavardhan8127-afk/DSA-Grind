class Solution {
    public int maxProduct(int n) {
        int size =  (int)Math.log10(n)+1;
        int[] arr = new int[size];
        int k=0;
        while(n>0){
            int digits = n%10;
            arr[k++] = digits;
            n=n/10;
        }
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int prod = arr[size-1] * arr[size-2];

        return prod;
    }
}