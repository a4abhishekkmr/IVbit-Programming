Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 

Return the sum of the three integers.

Assume that there will only be one solution

Example: 

given array S = {-1 2 1 -4}, 

and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
  
  
  public class Solution {
    public int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        int sum=0;
        int minDiff=Integer.MAX_VALUE;
        int n=A.length;
        int i=0;
        if(n<3) return 0;
        while(i<n-2)
        {
            int low=i+1;
            int high=n-1;
            while(low<high)
            {
                int val=A[i]+A[low]+A[high];
                int d=Math.abs(val-B);
                if(d==0) return B;
                if(d<minDiff)
                {
                    minDiff=d;
                    sum=val;
                }
                if(val<B) low++;
                else high--;
            }
            i++;
        }
        return sum;
    }
}
