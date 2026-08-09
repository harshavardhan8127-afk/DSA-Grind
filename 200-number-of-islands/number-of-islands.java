class Solution {
    public int numIslands(char[][] grid) {

        int count = 0;

        // checking for the island '1';
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    dfs(i,j,grid);
                    count++;
                    }
                }
            }
            return count;
        }
       
    static void dfs(int row,int col,char[][] grid){

        if(row<0 || col <0 || row>=grid.length || col>= grid[0].length || grid[row][col] == '0'){
            return;
        }

        // when '1' is found u make it as visited;
         grid[row][col] = '0';


        //up
        dfs(row-1,col,grid);
        //down
        dfs(row+1,col,grid);
        //right
        dfs(row,col+1,grid);
        //left
        dfs(row,col-1,grid);

    }
}