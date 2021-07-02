Given two sorted integer arrays A and B, merge B into A as one sorted array.

Note: You have to modify the array A to contain the merge of A and B. Do not output anything in your code.

TIP: C users, please malloc the result into a new array and return the result.

If the number of elements initialized in A and B are m and n respectively, the resulting size of array A after your code is executed should be m + n

Example :

Input : 
         A : [1 5 8]
         B : [6 9]

Modified A : [1 5 6 8 9]




public class Solution {
	public void merge(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i=0,j=0,m=A.size(),n=B.size();
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(i<m && j<n)
        {
            if(A.get(i)<B.get(j))
            {al.add(A.get(i));i++;}
            else if(B.get(j)<A.get(i))
            {al.add(B.get(j));j++;}
            else
            {al.add(A.get(i));i++;}
        }
        while(i<m)
        {
            al.add(A.get(i));i++;
        }
        while(j<n)
        {
            al.add(B.get(j));j++;
        }
        A.clear();
        for(int x: al)
        A.add(x);
	}
}
