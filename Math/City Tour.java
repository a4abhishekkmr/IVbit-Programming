There are A cities numbered from 1 to A. You have already visited M cities, the indices of which are given in an array B of M integers.

If a city with index i is visited, you can visit either the city with index i-1 (i >= 2) or the city with index i+1 (i < A) if they are not already visited. 
 Eg: if N = 5 and array M consists of [3, 4], then in the first level of moves, you can either visit 2 or 5.

You keep visiting cities in this fashion until all the cities are not visited. 
 Find the number of ways in which you can visit all the cities modulo 10^9+7.

Input Format

The 1st argument given is an integer A, i.e total number of cities.
The 2nd argument given is an integer array B, where B[i] denotes ith city you already visited.
Output Format

Return an Integer X % (1e9 + 7), number of ways in which you can visit all the cities.
Constraints

1 <= A <= 1000
1 <= M <= A
1 <= B[i] <= A
For Example

Input:
    A = 5
    B = [2, 5]
Output:
    6
   
Explanation:
    All possible ways to visit remaining cities are :
    1. 1 -> 3 -> 4
    2. 1 -> 4 -> 3
    3. 3 -> 1 -> 4
    4. 3 -> 4 -> 1
    5. 4 -> 1 -> 3
    6. 4 -> 3 -> 1
      
      
      
      public class Solution {
    public int solve(int A, int[] B) {
        long mod=1000000007;
        if(A==B.length) return 0;
        Arrays.sort(B);
        int N=A-B.length;

        
        ArrayList<Integer> al =new ArrayList<>();
        al.add(B[0]-1);//starting Gap
        for(int i=1;i<B.length;i++)
        al.add(B[i]-B[i-1]-1);//Middle gaps

        al.add(A-B[B.length-1]);//End Gaps

        long ans=0;
        ans=fact(N);
        for(int i=0;i<al.size();i++)
        {
            ans*=(power(fact(al.get(i)),1000000005)%mod);
            ans=ans%mod;
        }
        long z=1;
        for( int i= 1;i<al.size()-1; i++)
        {
            if(al.get(i)<2) continue;
            z*=power(2,al.get(i)-1);
            z=z%mod;
        }
        ans=(ans*z)%mod;
        return (int)(ans%mod);
    }
    
    
    long power(long a,long N)
    {long mod=1000000007;
        if(N==0) return 1;
        if(N==1) return a;
        long temp=(power(a,N/2))%mod;

        if(N%2==0) return ((temp*temp)%mod);
        return ((((a*temp)%mod)*temp)%mod)%mod;
    }

    long fact(long N)
    {long mod=1000000007;
        long ans=1;
        for(long i=1;i<=N;i++)
        {
            ans*=i;
            ans=ans%mod;
        }
        return ans;
    }
}
