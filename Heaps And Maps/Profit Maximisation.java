Problem Description

 Given an array A , representing seats in each row of a stadium. You need to sell tickets to B people.

Each seat costs equal to the number of vacant seats in the row it belongs to. The task is to maximize the profit by selling the tickets to B people.




Input Format
First argument is the array A.

Second argument is integer B.



Output Format
Return one integer, the answer to the problem.



Example Input
Input 1:

A = [2, 3]
B = 3
Input 2:

A = [1, 4]
B = 2


Example Output
Output 1:

7
Output 2:

7


Example Explanation
Explanation 1:

 First you serve the seat with number = 3. Then with 2 and then with 2. hence answer = 3 + 2 + 2 = 7.
Explanation 2:

 You give bith tickets from the row with 4 seats. 4 + 3 = 7.




 public class Solution {
    public int solve(int[] A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<A.length;i++)
        {
            pq.add(A[i]);
        }
        int sum=0;
        for(int i=0;i<B;i++)
        {
            int temp=pq.poll();
            sum+=temp;
            pq.add(temp-1);
        }
        return sum;
    }
}
