class Solution {
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
         for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
         }

         Set<Integer> vis = new HashSet<>();
         if(hasCycle(0,-1, adj, vis)){
            return false;
         }
          return vis.size() ==n;

    }
     boolean hasCycle(int node, int parent , List<List<Integer>> adj, Set<Integer> vis){
        if(vis.contains(node)){
            return  true;
        }
         vis.add(node);

        for(int it : adj.get(node)){
            if( it == parent)
             continue;
           
            if( hasCycle(it, node,adj, vis)){
                return true;
            }
        }
         return false;
     }
}
