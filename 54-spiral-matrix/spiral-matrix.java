class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        List<Integer> list = new ArrayList<>();
        // we need to maintain 4 boundaries 
        int top = 0;
        int left = 0;
        int bottom = row - 1;
        int right = col - 1;

        while(top<=bottom && left<=right){

            // moving form left -> right;
            for(int i=left; i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            // moving from top -> bottom
            for(int i=top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
            // moving from left -> right
            for(int i=right; i>=left; i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }

            if(left <= right){
            // moving from bottom -> top
            for(int i=bottom; i>=top; i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
        }
        
        return list;
    }
}