Given an array of real numbers greater than zero in form of strings.

Find if there exists a triplet (a,b,c) such that 1 < a+b+c < 2 . 

 Return 1 for true or 0 for false.

Example:

Given [0.6, 0.7, 0.8, 1.2, 0.4] ,

You should return 1

as

0.6+0.7+0.4=1.7

1<1.7<2

Hence, the output is 1.

O(n) solution is expected.
  
  
  
  public class Solution {
    public int solve(String[] A) {
        double a=Double.parseDouble(A[0]);
        double b=Double.parseDouble(A[1]);
        double c=Double.parseDouble(A[2]);


        for(int i=3;i<A.length;i++)
        {
            if(((a+b+c)<2) &&((a+b+c)>1))
            return 1;

            else if((a+b+c)>=2)
            {
                if(a>b && a>c)
                a=Double.parseDouble(A[i]);

                else if(b>c)
                b=Double.parseDouble(A[i]);

                else
                c=Double.parseDouble(A[i]);
            }
            else//(a+b+c)<=1
            {
                if(a<b && a<c)
                a=Double.parseDouble(A[i]);

                else if(b<c)
                b=Double.parseDouble(A[i]);

                else
                c=Double.parseDouble(A[i]);
            }
        }
        if(((a+b+c)>1) &&((a+b+c)<2))
          return 1;
        return 0;
    }
}
