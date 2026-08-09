class Solution {
    public int countIslands(int[][] grid, int k) {

        int count = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    long area = dfs(i,j,grid);
                    if(area % k == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    static long dfs(int r,int c,int[][] grid){

        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c] == 0){
            return 0;
        }

        //storing the value of each cell area
        long area = grid[r][c];
        //then making it to visited as 0
        grid[r][c] = 0;

         //up
        area += dfs(r-1,c,grid);
        //down
        area += dfs(r+1,c,grid);
        //right
        area += dfs(r,c+1,grid);
        //left
        area += dfs(r,c-1,grid);

        return area;
    }
}