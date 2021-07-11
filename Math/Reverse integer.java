Reverse digits of an integer.

Example1:

x = 123,

return 321

Example2:

x = -123,

return -321

Return 0 if the result overflows and does not fit in a 32 bit signed integer




public class Solution {
    public int reverse(int A) {
      //  if(A<-2147483647 || A>2147483646) return 0;
     if(A<0)
     {A=-A;
     int neg=rev(A);
     return -neg;}
     else
     return rev(A);


    }
    int rev(int A)
    {int res=0;
    int prev=0;
     while(A!=0)
     {
         int b=A%10;
         res=res*10+b;
         if((res-b)/10!=prev) return 0;
         prev=res;
         A=A/10;
    }
    return res;
    }
}
