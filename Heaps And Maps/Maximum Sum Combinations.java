Problem Description

Given two equally sized 1-D arrays A, B containing N integers each.

A sum combination is made by adding one element from array A and another element of array B.

Return the maximum C valid sum combinations from all the possible sum combinations.



Example Input
Input 1:

 A = [3, 2]
 B = [1, 4]
 C = 2
Input 2:

 A = [1, 4, 2, 3]
 B = [2, 5, 1, 6]
 C = 4


Example Output
Output 1:

 [7, 6]
Output 1:

 [10, 9, 9, 8]


Example Explanation
Explanation 1:

 7     (A : 3) + (B : 4)
 6     (A : 2) + (B : 4)
Explanation 2:

 10   (A : 4) + (B : 6)
 9   (A : 4) + (B : 5)
 9   (A : 3) + (B : 6)
 8   (A : 3) + (B : 5)




 public class Solution {
    public int[] solve(int[] A, int[] B, int C) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int s=0;
        Arrays.sort(A);
        Arrays.sort(B);
        reverse(A);
        reverse(B);
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
                {int sum=A[i]+B[j];
                    pq.add(sum);
                if(pq.size()>C)
                {
                    int last=pq.poll();
                    if(last==sum)
                    break;
                }
                }
        }
        int ans[]=new int[C];
        for(int i=0;i<C;i++)
        {
            ans[C-i-1]=pq.poll();
        }
        return ans;
    }
    public static void reverse(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }

}
