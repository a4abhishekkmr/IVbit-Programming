Problem Description

Hamming distance between two non-negative integers is defined as the number of positions at which the corresponding bits are different.

Given an array A of N non-negative integers, find the sum of hamming distances of all pairs of integers in the array. Return the answer modulo 1000000007.



Problem Constraints
1 <= |A| <= 200000

1 <= A[i] <= 109



Input Format
First and only argument is array A.



Output Format
Return one integer, the answer to the problem.



Example Input
Input 1:

 A = [1]
Input 2:

 A = [2, 4, 6]


Example Output
Output 1:

 0
Output 2:

 8


Example Explanation
Explanation 1:

 No pairs are formed.
Explanation 2:

 We return, f(2, 2) + f(2, 4) + f(2, 6) + f(4, 2) + f(4, 4) + f(4, 6) + f(6, 2) + f(6, 4) + f(6, 6) = 8
   
   
   
   
   
   public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int hammingDistance(final int[] A) {
        long ans=0;
    int count=0;
    long mod=1000000007;
    for(int i=0;i<32;i++)
    {
        count=0;
        for(int j=0;j<A.length;j++)
        {
            if(((A[j]>>i)&(1))==1)
            count++;
        }
        ans+=((long)count*(long)((A.length-count)));
        ans=ans%mod;
    }
        return (int)(2*ans%mod);
    
    //     long ans=0;
    // int count[]=new int[32];
    // int c=0;
    // long mod=1000000007;
    // for(int j=0;j<A.length;j++)
    // {
    //     for(int i=0;i<32;i++)
    //     {
    //         if(((A[j]>>i)&(1))==1)
    //         {count[i]++;}
    //     }
    // }
    // for(int j=0;j<32;j++){
    //     ans+=((long)count[j]*(long)((A.length-count[j])));
    //     ans=ans%mod;
    // }
    //     return (int)(2*ans%mod);
     }
}
