Input 1:
    A = [4, 5, 6, 7, 0, 1, 2, 3]
    B = 4
Output 1:
    0
Explanation 1:
 Target 4 is found at index 0 in A.


Input 2:
    A = [5, 17, 100, 3]
    B = 6
Output 2:
    -1






    public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int search(final int[] A, int B) {
        int low=0;
        int high=A.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(A[mid]==B)
            return mid;
            else if(A[low]<=A[mid])
            //left sorted
            {
                if(B>=A[low] && B<=A[mid])
                    high=mid-1;

                else
                low=mid+1;
            }
            else//right sorted
            {
                if(B>=A[mid] && B<=A[high])
                low=mid+1;

                else
                high=mid-1;
            }
        }
        return -1;
    }
}
