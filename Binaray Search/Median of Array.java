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
        // if(A.size()<=B.size())
        // return pass(A,B);

        // else
        // return pass(B,A);




           if (A.size()==0 && B.size()==0) return -1;
        int n1 = A.size(), n2 = B.size();
        if (n2 < n1) return findMedianSortedArrays(B, A);

        int l = 0, r = n1, half = (n1 + n2 + 1) >> 1;
        while (l <= r) {
            int m1 = ((r + l) >> 1);
            int m2 = half - m1;

            if (m1 < n1 && A.get(m1)< B.get(m2-1)) {
                // Too low, so moves right.
                l = m1 + 1;
            } else if (0 < m1 && B.get(m2) < A.get(m1-1)) {
                // Too high, so moves left.
                r = m1;
            } else {
                // Found cut.
                int maxleft = m1 == 0 ? B.get(m2-1) :
                        m2==0?A.get(m1-1):Math.max(A.get(m1-1),B.get(m2-1));

                if ((n1 + n2)%2==1) return maxleft;

                int minright = m1 == n1 ? B.get(m2) :
                        m2 == n2 ? A.get(m1): Math.min(A.get(m1), B.get(m2));
                return (maxleft + minright) / 2.0;
            }
        }
        return -1;

	}
//  double pass(List<Integer> A,List<Integer> B)
//  {
//      int n1=A.size();
//      int n2=B.size();
//      if(n1==0 && n2==0) return (double)n1;
//     if(n1==0)
//     {
//         if(n2%2==0)
//         return (double)(B.get(n2/2)+B.get((n2-1)/2))/2;
//         else
//         return (double)B.get(n2/2);
//     }
//     if(n2==0)
//     {
//         if(n1%2==0)
//         return (double)(A.get(n1/2)+A.get((n1-1)/2))/2;
//         else
//         return (double)(A.get(n1/2));
//     }
//      int begin =0;
//      int end=n1;
//      while(begin<end)
//      {
//          int i1=(begin+end)/2;
//          int i2=((n1+n2+1)/2)-i1;

//          int min1=(i1==n1)?Integer.MAX_VALUE:A.get(i1);
//          int max1=(i1==0)?Integer.MIN_VALUE:A.get(i1-1);

//          int min2=(i2==n2)?Integer.MAX_VALUE:B.get(i2);
//          int max2=(i2==0)?Integer.MIN_VALUE:B.get(i2-1);

//          //problem//
//         //Max1>min2
//         //max2>min1

//         if(max1<=min2 && max2<=min1)
//         {
//             if((n1+n2)%2==0)
//             return ((double)Math.max(max1,max2)+Math.min(min1,min2))/2;
//             else
//             return ((double)Math.max(max1,max2));
//         }

//         else if(max1>min2)
//         end=i1-1;
//         else
//         begin=i1+1;

//      }
//      return -1;
//  }

}
