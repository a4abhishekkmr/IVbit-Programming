Given an directed graph having A nodes labelled from 1 to A containing M edges given by matrix B of size M x 2such that there is a edge directed from node

B[i][0] to node B[i][1].

Find whether a path exists from node 1 to node A.

Return 1 if path exists else return 0.


Example Input
Input 1:

 A = 5
 B = [  [1, 2]
        [4, 1]
        [2, 4]
        [3, 4]
        [5, 2]
        [1, 3] ]
Input 2:

 A = 5
 B = [  [1, 2]
        [2, 3]
        [3, 4]
        [4, 5] ]


Example Output
Output 1:

 0
Output 2:

 1



Editorial:-

public class Solution {
    public int solve(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i =1; i<=A+1;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i =0; i<B.length;i++){
            adj.get(B[i][0]).add(B[i][1]);
        }
        boolean visited[]= new boolean[A+1];
        DFSRec(adj,visited,1,A);
        if(flag==true){
            return 1;
        }else{
            return 0;
        }
    }
    boolean flag = false;
   void DFSRec(  ArrayList<ArrayList<Integer>> adj,  boolean visited[], int src,int A){
          visited[src] = true;
          if(visited[A]==true){
              flag = true;
              return;
          }
        for(int u :adj.get(src)){
        if(!visited[u]){
            DFSRec(adj,visited,u,A);
        }
        }

    }
}
