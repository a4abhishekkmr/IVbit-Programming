Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

Example

Input : 4
Output : True
as 2^2 = 4.


public class Solution {
    public int isPower(int A) {
        if(A==0 || A==1) return 1;
        for(int i=2;i*i<=A;i++)
        {
            double val=Math.log(A)/Math.log(i);
            if((val-(int)val)<0.000000001) return 1;
        }
    return 0;
    }
}
