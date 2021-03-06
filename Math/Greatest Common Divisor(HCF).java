Given 2 non negative integers m and n, find gcd(m, n)

GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n.

Both m and n fit in a 32 bit signed integer.

Example

m : 6
n : 9

GCD(m, n) : 3



public class Solution {
    public int gcd(int a, int b) {
        int min= Math.min(a,b);
        if(min==0) return Math.max(a,b);
        while(min>0)
        {
            if((a%min==0)&&(b%min==0))
            break;

            min--;
        }
        return min;
    }
}
