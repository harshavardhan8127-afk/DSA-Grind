class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] res = new int[arr.length];
        int[] cpy = arr.clone();

        Arrays.sort(cpy);
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : cpy){
            if(!map.containsKey(n)){
                map.put(n,map.size()+1);
            }
        }

        for(int i=0;i<arr.length;i++){
            res[i] = map.get(arr[i]);
        }

        return res;
        
    }
}