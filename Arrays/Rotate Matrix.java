You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note that if you end up using an additional array, you will only receive partial score.

Example:

If the array is

[
    [1, 2],
    [3, 4]
]
Then the rotated array becomes:

[
    [3, 1],
    [4, 2]
]

public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
        for(int i=0;i<a.size();i++)
        {
        for(int j=i+1;j<a.get(0).size();j++)
        {
            int temp=a.get(i).get(j);
           int temp1=a.get(j).get(i);
            a.get(i).set(j,temp1);
            a.get(j).set(i,temp);
        }
        }
        for(int i=0;i<a.size();i++)
        {
            int low=0,high=a.get(0).size()-1;
            while(low<=high)
            {
                int temp=a.get(i).get(low);
                int temp1=a.get(i).get(high);
                a.get(i).set(low,temp1);
                a.get(i).set(high,temp);
                low++;high--;
            }
        }
	}
}
