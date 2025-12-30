class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //topo sort using BFS approach
        //first construct the graph and indegree array
        List<Integer>[] adj = new List[numCourses];
        int[] indegree = new int[numCourses];

        List<Integer> topo = new ArrayList<>();

        for(int[] pair : prerequisites){
            int course = pair[0];
            int preReq = pair[1];
            // preReq -> course is what we need
            if(adj[preReq] == null) adj[preReq] = new ArrayList<>();
            adj[preReq].add(course);
            indegree[course]++;
        }
        // Topo sort using BFS 
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.poll();
            topo.add(curr);

            if(adj[curr]!=null){
                for(int next : adj[curr]){
                    indegree[next]--;
                    if(indegree[next]==0){
                        q.offer(next);
                    }
                }
            }
        }
        // toposort success or not
        return topo.size() == numCourses; // if not possible, then cycle exists, and assignment not possible

    }
}