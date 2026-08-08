class Solution {
    public int findCircleNum(int[][] isConnected) {

        // for the no. of vertices
        int n = isConnected.length;
        int count = 0;
        // checking for the visiting of the nodes;
        boolean[] visited = new boolean[n];

        // for finding of a new city which is unvisited then increment the count;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                //this checks the current city is linked with other city or not
                dfs(i,isConnected,visited);
            }
        }
        return count;
    }
    static void dfs(int node,int[][] isConnected,boolean[] visited){

        // making the node true to mark visited
        visited[node] = true;

        // checking all the values in the matrix 
        for(int j=0;j<isConnected.length;j++){
            if(isConnected[node][j]== 1 && !visited[j]){
                dfs(j,isConnected,visited);
            }
        }
    }


}