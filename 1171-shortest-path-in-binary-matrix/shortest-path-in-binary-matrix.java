class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        Queue<int[]> q = new LinkedList<>();

        boolean[][] visited = new boolean[grid.length][grid[0].length]; 

        // as we start my the singel source every time so we dont need to chek
        // all and push it into the stack ,so start from (0,0) and do bfs

        //before putting into Queue 
        if(grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1) return -1;

        q.offer(new int[]{0,0});
        visited[0][0] = true;

         // these are all the 8 directions requried including all the diagonals
        int[][] directions =  {
            {-1,0},//up
            {1,0},//down
            {0,-1},//left
            {0,1},//right
            {-1,-1},// NW diagonal
            {-1,1},// NE diagonal
            {1,-1},// SW diagonal
            {1,1},// SE diagonal 
        };   

        int stepCount = 1;

        //BFS part
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){

                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                //edge case
                if(r == grid.length-1 && c == grid[0].length - 1) return stepCount;

                for(int[] dir : directions){

                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    //conditions
                    if(nc>=0 && nr>=0 && nr<grid.length && nc<grid[0].length && !visited[nr][nc]
                     && grid[nr][nc] == 0){

                        visited[nr][nc] = true;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
            stepCount++;
        }

        return -1;
    }

    }
