class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        boolean[] visit = new boolean[nums.length];

        helper(new ArrayList<>(),nums,visit,list);
     
     return list;
    }
    public static void helper(List<Integer> p,int[] nums,boolean[] visit,List<List<Integer>> list){
        if(p.size() == nums.length){
            list.add(new ArrayList<>(p));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(visit[i]){
                continue;
            }
            p.add(nums[i]);
            visit[i] = true;
            helper(p,nums,visit,list);

            p.remove(p.size()-1);
            visit[i]=false;
        }
    }
}