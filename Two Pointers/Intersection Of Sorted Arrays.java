Find the intersection of two sorted arrays.

OR in other words,

Given 2 sorted arrays, find all the elements which occur in both the arrays.

Example :

Input : 
    A : [1 2 3 3 4 5 6]
    B : [3 3 5]

Output : [3 3 5]

Input : 
    A : [1 2 3 3 4 5 6]
    B : [3 5]

Output : [3 5]


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        int i=0,j=0,m=A.size(),n=B.size();
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(i<m && j<n)
        {
            if(A.get(i)<B.get(j))
            i++;
            else if(B.get(j)<A.get(i))
            j++;
            else
            {al.add(A.get(i));i++;j++;}
        }
        return al;
    }
}
