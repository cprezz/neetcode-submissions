class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i< numCourses; i++){
            adj.add(new ArrayList<>());
        }

         for(int i=0;i<prerequisites.length;i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
         }

         int[] res = new int [numCourses];
         Stack<Integer> st = new Stack<>();
         if(hasCycle(numCourses, adj, st)){
            return new int[0];
         }
          int i=0;
        while(!st.isEmpty()){
            res[i] =st.peek();
            st.pop();
             i++;
        }
         return res;

        
    }

    boolean hasCycle(int n, List<List<Integer>> adj, Stack<Integer> st){
        int[] vis = new int[n];
        int[] pathVis = new int[n];

         for(int i=0;i<n;i++){
            if(vis[i] ==0){
                if(dfs(i, adj , st, vis, pathVis)){
                    return true;
                }
            }
         }
          return false;
    }

    boolean dfs(int node, List<List<Integer>> adj ,Stack<Integer> st , int[] vis, int[] pathVis){
        vis[node] = 1;
        pathVis[node]=1;

        for(int it : adj.get(node)){
            if(vis[it] ==0){
                if(dfs(it, adj, st, vis, pathVis))
                return true;
            } else if(pathVis[it]==1){
                return true;
            }
        }
        pathVis[node]= 0;
        st.push(node);
        return false;
    }
}
