Remove duplicates from Sorted Array

Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.

Note that even though we want you to return the new length, make sure to change the original array as well in place

Do not allocate extra space for another array, you must do this in place with constant memory.

Example: 

Given input array A = [1,1,2],

Your function should return length = 2, and A is now [1,2].
  
  
  public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
                int i=0;
        int j=0;

        int n=a.size();
        while(i<n)
        {
            int x=a.get(i);
            while(i<n && a.get(i)==x)
            {
                i++;
            }
                a.set(j++,x);
        }
        return j;
	}
}
