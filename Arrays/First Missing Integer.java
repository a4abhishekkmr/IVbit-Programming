Given an unsorted integer array, find the first missing positive integer.

Example:

Given [1,2,0] return 3,

[3,4,-1,1] return 2,

[-8, -7, -6] returns 1

Your algorithm should run in O(n) time and use constant space.
  
  
  
  public class Solution {
    public int firstMissingPositive(int[] A) {
        int n=A.length;
        int ans=1;
        //handle negative
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(A[i]>0)
            flag=true;//+ve
        }
        if(!flag) return 1;
        else
        ans=fn(A,n);
        return ans;
    }
    int fn(int arr[], int size)
    {
       for(int i=0;i<size;i++)
       {
           while(arr[i]>=1 && arr[i]<size  && arr[i]!=arr[arr[i]-1])
           {
               int temp=arr[arr[i]-1];
			    arr[arr[i]-1]=arr[i];
			    arr[i]=temp;
           }
       }
       //now checking i array
       for(int i=0;i<size;i++)
       if(arr[i]!=i+1)
       return i+1;

       return size+1;//if all present and then n+1 will be the answer
    }
}
