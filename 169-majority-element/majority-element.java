class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maj = 0;
        int maxkey = 0;
        for(int key : map.keySet()){
            if(map.get(key) > maj){
                maj = map.get(key);
                maxkey = key;
            }
        }
        return maxkey;
    }
}