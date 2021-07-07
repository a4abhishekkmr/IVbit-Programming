Problem Description

Given an integer A find the Ath number whose binary representation is a palindrome.

NOTE:

Consider the 1st number whose binary representation is palindrome as 1, instead of 0
Do not consider the leading zeros, while considering the binary representation.


Problem Constraints
 1 <= A <= 2104



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the Ath number whose binary representation is a palindrome.



Example Input
Input 1:

 A = 1
Input 1:

 A = 9


Example Output
Output 1:

 1
Output 2:

 27


Example Explanation*
Explanation 1:

 1st Number whose binary representation is palindrome is 1
Explanation 2

 9th Number whose binary representation is palindrome is 27 (11011)
   
   
   
   
   
   public class Solution {
    public int solve(int A) {
        int count=1;
        int len=1;
        while(count<A)
        {
            len++;
            int elementforLength=(1<<(len-1)/2);//1 2 2 2 4 4 4 8
            count+=elementforLength;
        }
        count-=(1<<(len-1)/2);//22
        int offset=A-count-1;

        int ans=(1<<(len-1));
        ans|=(offset<<(len/2));
        int valtobeReversed=(ans>>(len/2));
        int rev=getRev(valtobeReversed);
        ans|=rev;
        return ans;
    }
    public int getRev(int n)
    {
        int re=0;
        while(n!=0)
        {
            re|=(n&1);
            re=re<<1;
            n=n/2;
        }
        re=re>>1;
        return re;
    }
}

   
