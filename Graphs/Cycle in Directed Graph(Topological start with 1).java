Problem Description

Given an directed graph having A nodes. A matrix B of size M x 2 is given which represents the M edges such that there is a edge directed from node B[i][0] to node B[i][1].

Find whether the graph contains a cycle or not, return 1 if cycle is present else return 0.

NOTE:

The cycle must contain atleast two nodes.
There are no self-loops in the graph.
There are no multiple edges between two nodes.
The graph may or may not be connected.
Nodes are numbered from 1 to A.
Your solution will run on multiple test cases. If you are using global variables make sure to clear them.




public class Solution {
    private void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v)
    {
        adj.get(u).add(v);
    }
    public int solve(int A, int[][] B) {

        ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>(A);//size A. A times

        for(int i=0;i<A;i++)
        adj.add(new ArrayList<Integer>());

        int r=B.length;
        for(int i=0;i<r;i++)
        {
            addEdge(adj,B[i][0]-1,B[i][1]-1);
        }

        return TopologicalSort(adj,A);

    }
    private int TopologicalSort(ArrayList<ArrayList<Integer>> adj,int A)
    {
        int[] in_degree =new int[A];

        for(int u=0;u<A;u++)
        {
            for(int x:adj.get(u))
            in_degree[x]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<A;i++)
        if(in_degree[i]==0)
        q.add(i);

        int count=0;
        while(q.isEmpty()==false)
        {
            int u=q.poll();

            for(int x:adj.get(u))
            if(--in_degree[x]==0)
            q.add(x);

            count++;
        }
        if(count!=A)
        return 1;
        else
        return 0;

    }
}
