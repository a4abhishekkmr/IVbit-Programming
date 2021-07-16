The array A is [1 3 -1 -3 5 3 6 7], and B is 3.

Window position	Max
———————————-	————————-
[1  3  -1] -3  5  3  6  7	3
1 [3  -1  -3] 5  3  6  7	3
1  3 [-1  -3  5] 3  6  7	5
1  3  -1 [-3  5  3] 6  7	5
1  3  -1  -3 [5  3  6] 7	6
1  3  -1  -3  5 [3  6  7]	7
Return an array C, where C[i] is the maximum value of from A[i] to A[i+B-1].

Note: If B > length of the array, return 1 element with the max of the array.




Input Format

The first argument given is the integer array A.
The second argument given is the integer B.
Output Format

Return an array C, where C[i] is the maximum value of from A[i] to A[i+B-1]
For Example

Input 1:
    A = [1, 3, -1, -3, 5, 3, 6, 7]
    B = 3
Output 1:
    C = [3, 3, 5, 5, 6, 7]



    public class Solution {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int[] slidingMaximum(final int[] A, int B) {
            if(B==1) return A;

            int n=A.length;
            int max=A[0];
            int a[]=new int[1];
            if(B==0) return a;
            if(B>=n)
            {
                for(int i=1;i<n;i++)
                max=Math.max(max,A[i]);

                a[0]=max;
                return a;

            }

            // PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
            // int ans[]=new int[n-B+1];
            // for(int i=0;i<B;i++)
            // {
            //     pq.add(A[i]);
            // }
            // ans[0]=pq.peek();
            // int index=0;
            // int b=0;
            // for(int i=B;i<n;i++)
            // {pq.remove(A[index]);
            // index++;
            //     int up=pq.peek();

            //         pq.add(A[i]);
            //     ans[++b]=pq.peek();
            // }
            // return ans;


            ArrayDeque<Integer> dq=new ArrayDeque<>();
            int ans[]=new int[n-B+1];

            int i=0;
            for(;i<B;i++)
            {
                while(!dq.isEmpty() && A[dq.peekLast()]<=A[i])
                {
                    dq.removeLast();
                }
                dq.addLast(i);
            }
            for(;i<n;i++)
            {
                ans[i-B]=A[dq.peekFirst()];

                //checking out of window elements
                while(!dq.isEmpty() && dq.peekFirst()<=i-B)
                {
                    dq.removeFirst();
                }
                while(!dq.isEmpty() && A[dq.peekLast()]<=A[i])
                {
                    dq.removeLast();
                }
                dq.addLast(i);
            }

            ans[i-B]=A[dq.peekFirst()];


            return ans;

        }
    }
