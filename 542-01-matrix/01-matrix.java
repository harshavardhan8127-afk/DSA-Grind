class Solution {
    public int[][] updateMatrix(int[][] mat) {

        //This question also has a mulit source bfs

        Queue<int[]> q = new LinkedList<>();

         // this tells the cell already visited or not
        boolean[][] visited = new boolean[mat.length][mat[0].length];

        // checking all the 0's in the array and pushing into the queue
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){

                if(mat[i][j] == 0){
                    q.offer(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }

        int[][] directions = {
            {-1,0}, //up
            {1,0}, //down
            {0,-1}, //left;
            {0,1} //right
        };

        // Now the BFS part

        // this is used for storing the values in the new array
        int[][] ans = new int[mat.length][mat[0].length];

        while(!q.isEmpty()){

            int size = q.size();

            // check the elements in the queue
            for(int i = 0;i<size; i++){

                int[] curr = q.poll();

                int r = curr[0];
                int c = curr[1];

                //check all the four possible direction 
                for(int[] dir : directions){

                    int nr = r + dir[0];
                    int nc = c + dir[1];

                    if(nr>= 0 && nc>=0 && nr<mat.length && nc<mat[0].length && !visited[nr][nc]){

                        //making the cell true for not repetition
                        visited[nr][nc] = true;
                        //storing the value of the value in the new array
                        ans[nr][nc] = ans[r][c] + 1;
                        q.offer(new int[]{nr,nc});
                    }
                }
            }
        }
        return ans;
    }
}