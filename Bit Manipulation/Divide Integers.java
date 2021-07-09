Divide two integers without using multiplication, division and mod operator.

Return the floor of the result of the division.

Example:

5 / 2 = 2
Also, consider if there can be overflow cases. For overflow case, return INT_MAX.

Note: INT_MAX = 2^31 - 1
  
  
  public class Solution {
    public int divide(int A, int B) {
        
        long max=(long)Math.pow(2,31)-1;
       if(A == Integer.MIN_VALUE && B == -1)
            return Integer.MAX_VALUE;
        if(A == Integer.MIN_VALUE && B == 1)
            return Integer.MIN_VALUE;
//         A : -2147483648
// B : -1

// The expected return value: 
// 2147483647
        if(A==0) return 0;
        long l=A;
        long m=B;
       long sign=((l<0)^(m<0))?-1:1;

       long C=Math.abs(l);
       long D=Math.abs(m);

       long res=0;
       while((C-D)>=0)
       {
           long x=0;
           while(C-(D<<1<<x)>=0)
           {
               x++;
           }
           res+=1<<x;
           C-=D<<x;
       }
       return (int)(sign*res);
    }
}
