class Solution {
    private boolean check(int[][] graph, int[] color, int start){

        Queue<Integer> q = new LinkedList<Integer>();

        q.offer(start);
        color[start] = 0;

        while(!q.isEmpty()){

            int node = q.peek();
            q.poll();

            for(int i : graph[node]){
                if(color[i]==-1){
                    color[i] = 1 - color[node];
                    q.offer(i);
                }
                else if(color[i]==color[node]) return false;
            }

        }
        return true;

    }

    public boolean isBipartite(int[][] graph) {
        int v = graph.length;
        int[] color = new int[v];
        for(int i=0;i<v;i++) color[i] = -1;

        for(int i=0; i<v;i++){
            if(color[i]==-1){
                if(check(graph,color,i) == false) return false;
            }
        }
        return true;
    }
}