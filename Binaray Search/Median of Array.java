There are two sorted arrays A and B of size m and n respectively.

Find the median of the two sorted arrays ( The median of the array formed by merging both the arrays ).

The overall run time complexity should be O(log (m+n)).

Sample Input

A : [1 4 5]
B : [2 3]

Sample Output

3



public class Solution {
	// DO NOT MODIFY BOTH THE LISTS
	public double findMedianSortedArrays(final List<Integer> A, final List<Integer> B) {
        if(A.size()>B.size())
        return findMedianSortedArrays(B,A);

        int n1=A.size();
        int n2=B.size();

        int low=0;int high=n1;
        while(low<=high)
        {
            int i1=(low+high)/2;
            int i2=(n1+n2+1)/2-i1;

            int leftMax1=(i1==0)?Integer.MIN_VALUE:A.get(i1-1);
            int leftMax2=(i2==0)?Integer.MIN_VALUE:B.get(i2-1);

            int rightMin1=(i1==n1)?Integer.MAX_VALUE:A.get(i1);
            int rightMin2=(i2==n2)?Integer.MAX_VALUE:B.get(i2);
//problem
            if((leftMax1<=rightMin2)&&(leftMax2<=rightMin1))
            {
                if((n1+n2)%2==0)
                return ((double)Math.max(leftMax1,leftMax2)+Math.min(rightMin1,rightMin2))/2;
                else
                return (double)Math.max(leftMax1,leftMax2);
            }
            else if(leftMax1>rightMin2)
            {
                high=i1-1;
            }
            else
            {
                low=i1+1;
            }
        }return -1;
    }
}
