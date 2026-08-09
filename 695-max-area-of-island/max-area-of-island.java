class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int max = 0;

        // checking the value for '1';
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                   int area =  dfs(i,j,grid);
                    // give the maximum area among the all islands
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
    static int dfs(int r,int c,int[][] grid){

        if(r <0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c] == 0){
            return 0;
        }
        // if we got 1 we have to make it zero;
        grid[r][c] = 0;

        //initally the area = 1 because we have found the cell which have value 1
        int area = 1;

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