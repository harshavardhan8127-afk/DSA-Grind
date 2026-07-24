class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        helper(new ArrayList(),nums,0,ans);

        return ans;
    }
    public static void helper(List<Integer> p,int[] nums,int index,List<List<Integer>> ans){
        if(index == nums.length){
            ans.add(new ArrayList<>(p));
            return;
        }
        //taking it;
        p.add(nums[index]);
        helper(p,nums,index+1,ans);
        p.remove(p.size()-1);
        //not taking it
        helper(p,nums,index+1,ans);
    }
}