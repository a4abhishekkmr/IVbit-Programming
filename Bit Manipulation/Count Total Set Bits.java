Problem Description

Given a positive integer A, the task is to count the total number of set bits in the binary representation of all the numbers from 1 to A.

Return the count modulo 109 + 7.



Problem Constraints
1 <= A <= 109



Input Format
First and only argument is an integer A.



Output Format
Return an integer denoting the ( Total number of set bits in the binary representation of all the numbers from 1 to A )modulo 109 + 7.



Example Input
Input 1:

 A = 3
Input 2:

 A = 1


Example Output
Output 1:

 4
Output 2:

 1


Example Explanation
Explanation 1:

 DECIMAL    BINARY  SET BIT COUNT
    1          01        1
    2          10        1
    3          11        2
 1 + 1 + 2 = 4 
 Answer = 4 % 1000000007 = 4
Explanation 2:

 A = 1
  DECIMAL    BINARY  SET BIT COUNT
    1          01        1
 Answer = 1 % 1000000007 = 1





public class Solution {
    int mod=1000000007;
    public int solve(int B) {
        //this soln has high comp(Naive)
    //     int sum=0;
    //     for(int i=1;i<=A;i++)
    //     {
    //         sum+=(suma(i));
    //         sum=sum%mod;
    //     }
    //     return sum;
    // }

    // public int suma(int i)
    // {int count=0;
    //     while(i>0)
    //     {
    //         if((i&1)==1)
    //         count++;
    //         i=i/2;
    //     }
    //     return count;
    // }
    //Another Solution which is in logN approach
    long A=B;
    long x=Largestpowerof2(A);
    if(A==0) return 0;//bc
    long bitsuptoRange=((1<<(x-1))*x)%mod;
    long msb=A-(1<<(x))+1;//11-8+1
    long rest=A-(1<<x);

    long ans=bitsuptoRange+msb+solve((int)rest);

    return (int)ans%mod;
    }

    public long Largestpowerof2(long n)
    {
        long x=0;
        while((1<<x)<=n)
        {
            x++;
        }return x-1;
    }


}
