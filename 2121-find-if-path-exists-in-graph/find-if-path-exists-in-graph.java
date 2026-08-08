class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        //For the vertices 
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        //for the edges
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);

        }

        //to check the visited nodes
        boolean[] visited = new boolean[n];

        return dfs(source,destination,graph,visited);
    }
    static boolean dfs(int node,int d,ArrayList<ArrayList<Integer>> graph,boolean[] visited){

        // checking intially the source = destination
        if(node == d) return true;

        // marking the current node
        visited[node] = true;

        // for the neighbour of the node
        for(int neighbour : graph.get(node)){
            if(!visited[neighbour]){
                //if the dfs find the path then return true;
                if(dfs(neighbour,d,graph,visited)){
                    return true;
                }
            }

        }
        return false;
    }
}