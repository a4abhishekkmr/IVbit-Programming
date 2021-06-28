Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

Sample Input:

[3 4 1 4 1]
Sample Output:

1
If there are multiple possible answers ( like in the sample case above ), output any one.

If there is no duplicate, output -1





public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int repeatedNumber(final int[] arr) {
        HashSet<Integer> m=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(m.contains(arr[i])==false) m.add(arr[i]);
            else if(m.contains(arr[i])==true)
            return arr[i];
        }
        return -1;
    }
}

//O(n) and O(n)
