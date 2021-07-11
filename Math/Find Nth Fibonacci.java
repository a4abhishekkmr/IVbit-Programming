Problem Description

Given an integer A you need to find the Ath fibonacci number modulo 109 + 7.

The first fibonacci number F1 = 1

The first fibonacci number F2 = 1

The nth fibonacci number Fn = Fn-1 + Fn-2 (n > 2)



Example Input
Input 1:

 A = 4
Input 2:

 A = 3


Example Output
Output 1:

 3
Output 2:

 2





 public class Solution {
    public void multiply(long F[][], long M[][])  {
        long x =  F[0][0]% 1000000007*M[0][0]% 1000000007 + F[0][1]% 1000000007*M[1][0]% 1000000007;
        long y =  F[0][0]% 1000000007*M[0][1]% 1000000007 + F[0][1]% 1000000007*M[1][1]% 1000000007;
        long z =  F[1][0]% 1000000007*M[0][0]% 1000000007 + F[1][1]% 1000000007*M[1][0]% 1000000007;
        long w =  F[1][0]% 1000000007*M[0][1]% 1000000007 + F[1][1]% 1000000007*M[1][1]% 1000000007;
        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }
    public void power(long [][]ans , int n) {
        if(n == 1 || n == 1)
            return ;
        long [][]temp = new long[][]{{1,1},{1,0}};
        power(ans, n / 2);
        multiply(ans, ans);
        if(n % 2 == 1)
            multiply(ans, temp);
    }
    public int solve(int n) {
        long ans[][] = new long[][]{{1,1},{1,0}};
        if(n == 0)
            return 0;
        power(ans, n - 1);
        return (int)(ans[0][0] % 1000000007);
    }
}
