Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.

Negative numbers are not palindromic.

Example :

Input : 12121
Output : True

Input : 123
Output : False



public class Solution {
    public int isPalindrome(int A) {
     int res=0;
     if(A<0) return 0;
     int g=A;
     while(A!=0)
     {
         int b=A%10;
         res=res*10+b;
         A=A/10;
     }
     //System.out.println(res);
     if(res==g) return 1;
     else return 0;
    }
}
