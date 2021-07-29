Problem Description

Max Heap is a special kind of complete binary tree in which for every node the value present in that node is greater than the value present in it’s children nodes.

Find the number of distinct Max Heap can be made from A distinct integers.

In short, you have to ensure the following properties for the max heap :

Heap has to be a complete binary tree ( A complete binary tree is a binary tree in which every level, except possibly the last, is completely filled, and all nodes are as far left as possible.)
Every node is greater than all its children.
NOTE:  If you want to know more about Heaps, please visit this link. Return your answer modulo 109 + 7.



Problem Constraints
1 <= A <= 100



Input Format
First and only argument is an inetegr A.



Output Format
Return an integer denoting the number of distinct Max Heap.



Example Input
Input 1:

 A = 4
Input 2:

 A = 10


Example Output
Output 1:

 3
Output 2:

 3360


Example Explanation
Explanation 1:

 Let us take 1, 2, 3, 4 as our 4 distinct integers
 Following are the 3 possible max heaps from these 4 numbers :
      4           4                     4
    /  \         / \                   / \
   3    2   ,   2   3      and        3   1
  /            /                     /

 1            1                     2







 public class Solution {

    long dp[] ;
    long nck[][] ;
    int log2[] ;
    long mod = 1000000007;
    // nck
    long choose( int n , int k)
    {
         if (k > n)  return 0;

        if (n <= 1) return 1;

        if (k == 0)  return 1;

        if (nck[n][k] != -1) return nck[n][k];

        long answer = choose(n - 1, k - 1) + choose(n - 1, k);
        answer%=mod;
        nck[n][k] = answer;
        return answer;
    }
    int getL(int n)
    {
        if(n==1) return 0;
        int h=  log2[n];
        int maxAth = (1<<h)/2 ;

        int lastLevelEle = n -((1<<h) -1);
        int exactlyAtlast = Math.min(maxAth, lastLevelEle);

        return ( 1<<(h-1) ) - 1 + exactlyAtlast;

    }

    public long getNumberOfMaxHeaps(int n)
    {
        if(n<=1)
            return 1;

        if(dp[n]!=-1)
            return dp[n];

        int L = getL(n);
        long ans = (choose(n-1,L)*getNumberOfMaxHeaps(L))%mod*(getNumberOfMaxHeaps(n-1-L));
        ans%=mod;
        dp[n] = ans;
        return ans;
    }


    public int solve(int n) {

        dp = new long[n+1];
        for(int i=0;i<=n;i++)
            dp[i]=-1;

            nck = new long[n+1][n+1];
        for(int i=0;i<=n;i++)
            for(int j=0;j<=n;j++)
                nck[i][j] = -1;

            log2 = new int[n+1];
        int currLogAnswer = -1;
        int currPower2 = 1;
        for(int i=1;i<=n;i++)
        {
	    if(currPower2==i)
            {
                currLogAnswer++;
                currPower2*=2;
            }
            log2[i] = currLogAnswer;
        }
        return (int)getNumberOfMaxHeaps(n);
    }
}
