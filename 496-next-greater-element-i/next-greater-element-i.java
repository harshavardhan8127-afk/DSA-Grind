class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--){
            int curr = nums2[i];

            while(!st.isEmpty() && st.peek() <= curr){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(curr,-1);
            }
            else{
                map.put(curr,st.peek());
            }
            st.push(curr);
        }

        for(int i=0;i<nums1.length;i++){
            res[i] = map.get(nums1[i]);
        }


        return res;
    }
}