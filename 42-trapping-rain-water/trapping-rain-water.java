class Solution {
    public int trap(int[] height) {

        int h = height.length;
        //Two pointers
        int left = 0;
        int right = h - 1;
        //we need the max of the walls from both sides
        int leftMax = 0;
        int rightMax = 0;
        //water count
        int water = 0;

        while(left <= right){
            //checking for the height on the left
            if(height[left] <= height[right]){

                if(height[left] < leftMax){
                    water += leftMax - height[left];
                }
                else{
                    leftMax = height[left];
                }
                left++;
            }
            else{
            // checking for the height on the right
                if(height[right] < rightMax){
                    water += rightMax - height[right];
                }
                else{
                    rightMax = height[right];
                }
                right--;
            }
            
        }
        return water;
    }
}