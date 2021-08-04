Problem Description

Given an N x M matrix A of non-negative integers representing the height of each unit cell in a continent, the "Blue lake" touches the left and top edges of the matrix and the "Red lake" touches the right and bottom edges.

Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.

Find the number of cells from where water can flow to both the Blue and Red lake.



Problem Constraints
1 <= M, N <= 1000

1 <= A[i][j] <= 109



Input Format
First and only argument is a 2D matrix A.



Output Format
Return an integer denoting the number of cells from where water can flow to both the Blue and Red lake.



Example Input
Input 1:

 A = [
       [1, 2, 2, 3, 5]
       [3, 2, 3, 4, 4]
       [2, 4, 5, 3, 1]
       [6, 7, 1, 4, 5]
       [5, 1, 1, 2, 4]
     ]
Input 2:

 A = [
       [2, 2]
       [2, 2]
     ]


Example Output
Output 1:

 7
Output 2:

 4


Example Explanation
Explanation 1:

 Blue Lake ~   ~   ~   ~   ~
        ~  1   2   2   3  (5) *
        ~  3   2   3  (4) (4) *
        ~  2   4  (5)  3   1  *
        ~ (6) (7)  1   4   5  *
        ~ (5)  1   1   2   4  *
           *   *   *   *   * Red Lake
 Water can flow to both lakes from the cells denoted in parentheses.

Explanation 2:

 Water can flow from all cells.
 




public class Solution {
    class pair{
        int x;int y;
        pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    int count=0;
    public int solve(int[][] A) {
        count=0;
        int n=A.length;
        int m=A[0].length;
        int [][]vis=new int[n][m];
        int [][]v=new int[n][m];
        for(int i=0;i<n;i++){
            vis[i][0]=1;
            v[i][m-1]=1;
           bfs(A,n-1,m-1,i,m-1,v);
           bfs(A,n-1,m-1,i,0,vis);
        }
        for(int i=0;i<m;i++){
            vis[0][i]=1;
            v[n-1][i]=1;
           bfs(A,n-1,m-1,n-1,i,v);
           bfs(A,n-1,m-1,0,i,vis);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(vis[i][j]==1 && v[i][j]==1)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int[][] A,int n,int m,int a,int b,int[][] v){
        int x,y;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(a,b));
        while(!q.isEmpty()){
            pair p=q.poll();
            x=p.x;
            y=p.y;
            if(x-1>=0 && A[x-1][y]>=A[x][y] && v[x-1][y]==0){
                q.add(new pair(x-1,y));
                v[x-1][y]=1;
            }
            if(x+1<=n && A[x+1][y]>=A[x][y] && v[x+1][y]==0){
                q.add(new pair(x+1,y));
                v[x+1][y]=1;
            }
            if(y-1>=0 && A[x][y-1]>=A[x][y] && v[x][y-1]==0){
                q.add(new pair(x,y-1));
                v[x][y-1]=1;
            }
            if(y+1<=m && A[x][y+1]>=A[x][y] && v[x][y+1]==0){
                q.add(new pair(x,y+1));
                v[x][y+1]=1;
            }
        }
        return;
    }
}
