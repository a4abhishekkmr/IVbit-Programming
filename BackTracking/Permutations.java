Given a collection of numbers, return all possible permutations.

Example:

[1,2,3] will have the following permutations:

[1,2,3]
[1,3,2]
[2,1,3]
[2,3,1]
[3,1,2]
[3,2,1]
NOTE

No two entries in the permutation sequence should be the same.
For the purpose of this problem, assume that all the numbers in the collection are unique.



public class Solution {
    ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        int n=A.size();
        cal(new ArrayList<Integer>(), A);

        return ans;
    }
    void cal(ArrayList<Integer> black,ArrayList<Integer> blue)
    {
        if(blue.size()==0)
        {ans.add(new ArrayList<Integer>(black));}

        else
        {
            for(int i=0;i<blue.size();i++)
            {
                int temp=blue.remove(i);
                black.add(temp);
                cal(black,blue);
                blue.add(i,temp);
                black.remove(black.size()-1);
            }
        }
    }
}
