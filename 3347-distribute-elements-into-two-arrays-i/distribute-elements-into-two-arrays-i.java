class Solution {
    public int[] resultArray(int[] nums) {

        int[] res = new int[nums.length];

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        for(int i=2;i<nums.length;i++){
            //arr1.get(arr.size()-1)
            if(arr1.getLast() > arr2.getLast()) arr1.add(nums[i]);
            else arr2.add(nums[i]);
        }

        int k=0;
        for(int x : arr1) res[k++] = x;
        for(int x : arr2) res[k++] = x;

        return res;   
    }
}