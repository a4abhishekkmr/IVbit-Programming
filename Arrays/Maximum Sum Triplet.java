Problem Description

Given an array A containing N integers.

You need to find the maximum sum of triplet ( Ai + Aj + Ak ) such that 0 <= i < j < k < N and Ai < Aj < Ak.

If no such triplet exist return 0.



Problem Constraints
3 <= N <= 105.

1 <= A[i] <= 108.



Input Format
First argument is an integer array A.



Output Format
Return a single integer denoting the maximum sum of triplet as described in the question.



Example Input
Input 1:

 A = [2, 5, 3, 1, 4, 9]
Input 2:

 A = [1, 2, 3]


Example Output
Output 1:

 16
Output 2:

 6

   
   
   public class Solution {
    public int solve(int[] A) {
        int n=A.length;
    //     int w=0,x=0,y=0;
    //     int i1=0;

    //     for(int i=0;i<n;i++)
    //     if(A[i]>y)
    //     {
    //         i1=i;
    //         y=A[i];
    //     }
    //     int j=0;
    //     int i2=0;
    //     for(j=0;j<i1;j++)
    //     if(A[j]>x)
    //     {
    //         i2=j;
    //         x=A[j];
    //     }
    // for(int k=0;k<i2;k++)
    //     w=Math.max(A[k],w);//if(A[i]!=y && A[i]!=x)
        
    //  System.out.println(w+" "+x+" "+y);
    // return x+y+w;

    // Initialize suffix-array
    int maxSuffArr[] = new int[n + 1];

    maxSuffArr[n]=0;

    for(int i=n-1;i>=0;--i)
    {
        maxSuffArr[i]=Math.max(maxSuffArr[i+1],A[i]);
    }

    TreeSet<Integer> ts= new TreeSet<>();

    ts.add(Integer.MIN_VALUE);

    int ans=0;
    for(int i=0;i<n-1;i++)
    {
        if(maxSuffArr[i+1]>A[i])
        {
            ans=Math.max(ans,ts.lower(A[i])+A[i]+maxSuffArr[i+1]);
            ts.add(A[i]);
        }
    }
return ans;
}
//10 32592 18763 1656 17411 6360 27625 20538 21549 6484 27596
}
