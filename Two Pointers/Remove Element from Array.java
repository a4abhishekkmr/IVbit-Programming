Given an array and a value, remove all the instances of that value in the array. 

Also return the number of elements left in the array after the operation.

It does not matter what is left beyond the expected length.

Example:

If array A is [4, 1, 1, 2, 1, 3]

and value elem is 1, 

then new length is 3, and A is now [4, 2, 3]

Try to do it in less than linear additional space complexity.
  
  
  
  public class Solution {
	public int removeElement(ArrayList<Integer> a, int b) {
		int n=a.size();
		int index=0;
		for(int j=0;j<n;j++)
		{
			if(a.get(j)!=b)
			a.set(index++,a.get(j));
		}
		return index;
	}
}
