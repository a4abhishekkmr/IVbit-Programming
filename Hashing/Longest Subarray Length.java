Given an integer array A of size N containing 0's and 1's only.

You need to find the length of the longest subarray having count of 1’s one more than count of 0’s.



Example Input
Input 1:

 A = [0, 1, 1, 0, 0, 1]
Input 2:

 A = [1, 0, 0, 1, 0]


Example Output
Output 1:

 5
Output 2:

 1


Example Explanation
Explanation 1:

 Subarray of length 5, index 1 to 5 i.e 1, 1, 0, 0, 1. Count of 1 = 3, Count of 0 = 2.
Explanation 2:

 Subarray of length 1 will be only subarray that follow the above condition.




 public class Solution {
    public int solve(int[] A) {
        int n=A.length;
        int sum=0;int length=0;

for(int i=0;i<n;i++)
{
    if(A[i]==0) A[i]=-1;
}
HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            sum+=A[i];
            if(sum==1)
            length=i+1;
            if(map.containsKey(sum-1))
            {
                if(length<i-map.get(sum-1))
                length=i-map.get(sum-1);
            }
            if(!map.containsKey(sum))
            map.put(sum,i);
        }
        return length;
    }
}
