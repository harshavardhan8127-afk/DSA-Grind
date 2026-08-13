class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

      //no.of vertices are
      int n = rooms.size();

      //checking of the visiting of the vertices
      boolean[] visited = new boolean[n];

      //so we everytime start with the 0 start the dfs
      dfs(0,rooms,visited);

      //now cheking the every room is visted or not
      for(int i=0;i<n;i++){
        if(!visited[i]){
            return false;
        }
      }
      return true; 
    }
    //DFS part
    static void dfs(int node,List<List<Integer>> rooms,boolean[] visited){
        // marking the every new node
        visited[node] = true;

        //for the values prresent in the room
        for(int key : rooms.get(node)){
            if(!visited[key]){
                dfs(key,rooms,visited);
            }
        }
    }
}