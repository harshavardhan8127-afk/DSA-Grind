class Solution {
    public int orangesRotting(int[][] grid) {

        //Have to use the Multi-Source BFS
        Queue<int[]> q = new LinkedList<>();

        //to know count of the fresh oranges
        int fresh = 0;

        //checking the matrix
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }

                if(grid[i][j] == 1) fresh++;
            }
        }

        int[][] directions = {
            {-1, 0},  // up
            {1, 0},   // down
            {0, -1},  // left
            {0, 1}    // right
        };

        //BFS part
        int time = 0;

        while(!q.isEmpty() && fresh > 0){

            int size = q.size();

            for(int i=0;i<size;i++){

                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                for(int[] dir : directions){

                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc] == 1){

                        //making fresh oranges into rotten
                        grid[nr][nc] = 2;
                        fresh--;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
            time++;
        }
        //if fresh oranges are still remaing 
        if(fresh > 0) return -1;

        return time;
    }
}