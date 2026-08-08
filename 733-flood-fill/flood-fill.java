class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int ogCol = image[sr][sc];

        if(ogCol == color) return image;


        dfs(sr,sc,image,ogCol,color);
        
        return image;
    }
    static void dfs(int row,int col,int[][] image,int ogCol,int color){

        // matrix boundary checks
        if(row<0 || col <0 || row >= image.length || col >= image[0].length){
            return;
        }

        if(image[row][col] != ogCol){
            return;
        }

        // marking as visited
        image[row][col] = color;

        //up
        dfs(row-1,col,image,ogCol,color);
        //down
        dfs(row+1,col,image,ogCol,color);
        //right
        dfs(row,col+1,image,ogCol,color);
        //left
        dfs(row,col-1,image,ogCol,color);
    }
}