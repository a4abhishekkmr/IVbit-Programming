Remove Duplicates from Sorted Array

Given a sorted array, remove the duplicates in place such that each element can appear atmost twice and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

Note that even though we want you to return the new length, make sure to change the original array as well in place

For example,

Given input array A = [1,1,1,2],

Your function should return length = 3, and A is now [1,1,2].
  
  
  
  
  
  public class Solution {
	public int removeDuplicates(ArrayList<Integer> A) {
        int n=A.size();
        int j=0;
        if(n<3)
        return n;
        for(int i=0;i<n;i++)//n
        {
            int temp=A.get(i);
            if(i<n-2 && A.get(i+1).equals(temp) && A.get(i+2).equals(temp)) continue;//i<n-2
            else
            {A.set(j++,temp);
            }
        }
        return j;
	}
}
