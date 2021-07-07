We define f(X, Y) as number of different corresponding bits in binary representation of X and Y. For example, f(2, 7) = 2, since binary representation of 2 and 7 are 010 and 111, respectively. The first and the third bit differ, so f(2, 7) = 2.

You are given an array of N positive integers, A1, A2 ,…, AN. Find sum of f(Ai, Aj) for all pairs (i, j) such that 1 ≤ i, j ≤ N. Return the answer modulo 109+7.

For example,

A=[1, 3, 5]

We return

f(1, 1) + f(1, 3) + f(1, 5) + 
f(3, 1) + f(3, 3) + f(3, 5) +
f(5, 1) + f(5, 3) + f(5, 5) =

0 + 1 + 1 +
1 + 0 + 2 +
1 + 2 + 0 = 8
    
    
    
    
    

public class Solution {
    public int cntBits(int[] A) {
    //     int sum=0;
    //     int mod=1000000007;
    //     for(int i=0;i<A.length;i++)
    //     {
    //         for(int j=0;j<A.length;j++)
    //         {
    //             sum+=f(A[i],A[j]);
    //         }
    //     }
    //     return sum%mod;
    // }
    // public int f(int a,int b)
    // {
    //     int count=0;
    //     int xor=a^b;
    //     while(xor>0)
    //     {
    //         if(((xor)&1)==1) count++;
    //         xor/=2;
    //     }
    //     return count;
    // }
    // long ans=0;
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
    // }
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
    }
}
// }
