Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int n) {
        ArrayList<ArrayList<Integer>> al= new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++)
        al.add(new ArrayList<Integer>());

        if(n==0) return al;
        al.get(0).add(1);
        if(n==1) return al;
        al.get(1).add(1);
        al.get(1).add(1);
        if(n==2) return al;
        int temp=0;
        for(int i=2;i<n;i++)
        {al.get(i).add(1);
            for(int j=1;j<i;j++)
           { temp=al.get(i-1).get(j-1)+al.get(i-1).get(j);
            al.get(i).add(temp);
           }al.get(i).add(1);
        }
        return al;
    }
}
