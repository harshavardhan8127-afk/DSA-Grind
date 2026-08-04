class Solution {
    public List<Integer> findMissingElements(int[] nums) {
    
    //int[] nums = {1,2,3,1,6,7};

        // Arrays.sort(nums);
        // List<Integer> list = Arrays.stream(nums).boxed().toList();
        // List<Integer> res = new ArrayList<>();

        // int min = nums[0];
        // int max = nums[nums.length - 1];
        // for(int i=min;i<max;i++){
        //     res.add(i);
        // }

        // res.removeAll(list);

        // return res;
    
    
    
    
    
       Arrays.sort(nums);
       List<Integer> list=new ArrayList<>();
    //    for(int i=1;i<nums.length;i++){
    //if(nums.length==1) return list;
    //     int j
        int i=1;
        while(i<=nums.length-1){
            while(nums[i-1]+1!=nums[i]&&i<=nums.length-1){
            list.add(nums[i-1]+1);
            nums[i-1]=nums[i-1]+1;
        }
        i++;
       }
       return list;






    }
}