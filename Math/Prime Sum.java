Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

NOTE A solution will always exist. read Goldbach’s  conjecture

Example:


Input : 4
Output: 2 + 2 = 4



public class Solution {
    public int[] primesum(int A) {
        int ans[]=new int[2];
        for(int i=2;i<A;i++)
        {
            if(isPrime(i)&& isPrime(A-i))
            {
            ans[0]=i;
            ans[1]=A-i;
            return ans;
            }
        }


        return ans;


    }

    boolean isPrime(int n)
    {
        if(n==1) return false;
        if(n==2|| n==3) return true;
        if((n%2==0)||(n%3==0))
        return false;

        for(int i=5;i*i<=n;i=i+6)
        if(n%i==0 || n%(i+2)==0)
        return false;

        return true;

    }



}
