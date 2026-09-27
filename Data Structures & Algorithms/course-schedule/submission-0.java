class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

         for(int i=0;i<prerequisites.length;i++){
             adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
         }
        return !hasCycle(numCourses, adj);
        
    }

    Boolean hasCycle(int n, List<List<Integer>> adj){
        int[] vis = new int[n];
        int[] pathVis = new int[n];
        Arrays.fill(vis,0);
        Arrays.fill(pathVis, 0);

        for(int i=0;i<n;i++){
            if(vis[i] ==0){
                if(dfs(i, adj,vis, pathVis))
                return true;
            }
        }
        return false;
    }
    
     boolean dfs(int node, List<List<Integer>> adj, int[] vis, int[] pathVis){
         vis[node]=1;
            pathVis[node] =1;
            for(int it : adj.get(node)){
                if(vis[it]==0){
                if(dfs(it, adj, vis, pathVis)==true)
                return true;
            }
         else if(pathVis[it] ==1){
            return true;
        }
            }
       pathVis[node] =0;

        return false;
     }

     
}
