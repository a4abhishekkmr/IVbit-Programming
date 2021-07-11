Given an array of integers A of size N and an integer B.

College library has N bags,the ith book has A[i] number of pages.

You have to allocate books to B number of students so that maximum number of pages alloted to a student is minimum.

A book will be allocated to exactly one student.
Each student has to be allocated at least one book.
Allotment should be in contiguous order, for example: A student cannot be allocated book 1 and book 3, skipping book 2.
Calculate and return that minimum possible number.

NOTE: Return -1 if a valid assignment is not possible.





public class Solution {
    public int books(int[] A, int B) {
        if(B>A.length) return -1;
        int sum=0,mx=0;
        for(int i=0;i<A.length;i++)
        {
            sum+=A[i];
            mx=Math.max(mx,A[i]);
        }
        int low=mx,high=sum,res=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(isFeasible(A,B,mid))
            {
                res=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return res;
    }
    boolean isFeasible(int A[],int B,int ans)
    {
        int req=1,sum=0;
        for(int i=0;i<A.length;i++)
        {
            if(sum+A[i]>ans)
            {
                req++;
                sum=A[i];
            }
            else
            {
                sum+=A[i];
            }
        }
        return (req<=B);
    }
}
