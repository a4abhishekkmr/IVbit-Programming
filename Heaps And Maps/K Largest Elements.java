Example Input
Input 1:

 A = [11, 3, 4]
 B = 2
Input 2:

 A = [11, 3, 4, 6]
 B = 3


Example Output
Output 1:

 [11, 4]
Output 2:

 [4, 6, 11]





 public class Solution {
    public int[] solve(int[] A, int B) {

        int arr[]=new int[B];
        if(B>A.length)
        return arr;//bc
        PriorityQueue<Integer> minheap=new PriorityQueue<>();

        for(int i=0;i<B;i++)
        minheap.add(A[i]);

        for(int i=B;i<A.length;i++)
        {
            if(minheap.peek()>=A[i])
            continue;
            else
            {
                minheap.poll();
                minheap.add(A[i]);
            }
        }

        int index=0;
        for(int i:minheap)
        {
            arr[index++]=i;
            //index++;
            // System.out.print(i+" ");
        }
        // while(minheap.isEmpty()==false)
        // {
        //     arr[index++]=minheap.poll();
        // }
         return arr;

    }
}
