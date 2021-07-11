Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?

Find all unique triplets in the array which gives the sum of zero.


public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        int i=0;
        int n1=A.size();
        if(n1<3) return al;
        while(i<n1-2)
        {
            int low=i+1;
            int high=n1-1;
            long target=-(long)A.get(i);
            while(low<high)
            {
                long val=(long)A.get(low)+(long)A.get(high);
                if((val==target))
                {
                    ArrayList<Integer> temp=new ArrayList<Integer>();
                    temp.add(A.get(i));
                    temp.add(A.get(low));
                    temp.add(A.get(high));
                    if(!al.contains(temp))
                    al.add(temp);
                    low++;high--;
                }
                else if(val<target) low++;
                else high--;
            }
            i++;
        }
        return al;
    }
}
//A : [ 1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3 ]

// The expected return value:
// [-5 0 5 ] [-5 1 4 ] [-4 -1 5 ] [-4 0 4 ] [-4 1 3 ] [-3 -2 5 ] [-3 -1 4 ] [-3 0 3 ] [-2 -1 3 ] [-2 1 1 ] [-1 0 1 ] [0 0 0 ]
