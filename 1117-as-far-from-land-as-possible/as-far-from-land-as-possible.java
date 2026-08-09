class Solution {
    public int maxDistance(int[][] grid) {
    
    //This also a Multi Source BFS

    Queue<int[]> q = new LinkedList<>();

    //to check the cell is visited or not
    boolean[][] visited = new boolean[grid.length][grid[0].length];

    int land = 0; // this is for the edge case where 0 land and 0 water returns -1;

    //visiting the 1's int the grid
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j] == 1){
                land++;
                visited[i][j] = true;
                q.offer(new int[]{i,j});
            }
        }
    }
    //edge case of the land and water(IMP)
    if(land == 0 || land == grid.length * grid[0].length) return -1;

    //directions
    int[][] directions = {
        {-1,0},//up
        {1,0},//down
        {0,-1},//left
        {0,1}//right
    };
    //BFS part
    int dist = 0;

    while(!q.isEmpty()){
        int size = q.size();

        for(int i=0; i<size; i++){

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            for(int[] dir : directions){

                int nr = r + dir[0];
                int nc = c + dir[1];

                if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && !visited[nr][nc]){

                    // visiting the nr and nc and making them true;
                    visited[nr][nc] = true;
                    q.offer(new int[]{nr,nc});
                    
                }
            }
        }
        dist++;
    }
    return dist - 1;
    }
}