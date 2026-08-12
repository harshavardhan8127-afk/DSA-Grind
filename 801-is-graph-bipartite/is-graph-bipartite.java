class Solution {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;

        int[] color = new int[n];
        //fill all the color with -1;
        Arrays.fill(color,-1);

        for(int i=0;i<n;i++){
            if(color[i] != -1){
                continue;
            }    

        // BFS part
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        color[i] = 0;

        while(!q.isEmpty()){
            int node = q.poll();

            for(int neighbour : graph[node]){

                if(color[neighbour] == -1){

                    // changing the color of the neighbour node using the curr node
                    color[neighbour] = 1 - color[node];
                    //pushing in the queue
                    q.offer(neighbour);
                }
                //checking the two node have the same color
                else if(color[neighbour] == color[node]){
                    return false;
                }            
                }
        }
        }
        return true;
    }
}