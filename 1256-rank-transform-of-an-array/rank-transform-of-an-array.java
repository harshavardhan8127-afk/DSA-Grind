class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] res = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            res[i] = arr[i];
        }
        Arrays.sort(res);

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : res){
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