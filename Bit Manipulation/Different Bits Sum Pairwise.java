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
