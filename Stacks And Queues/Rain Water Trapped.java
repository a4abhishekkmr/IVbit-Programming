Example Input
Input 1:

 A = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
Input 2:

 A = [1, 2]


Example Output
Output 1:

 6
Output 2:

 0



 public class Solution {
     // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
     public int trap(final int[] A) {
         // int n=A.length;
         // int lmax[]=new int[n];
         // int rmax[]=new int[n];
         // lmax[0]=A[0];
         // rmax[n-1]=A[n-1];
         // for(int i=1;i<n;i++)
         // {
         //     lmax[i]=Math.max(lmax[i-1],A[i]);
         // }
         // for(int i=n-2;i>=0;i--)
         // {
         //     rmax[i]=Math.max(rmax[i+1],A[i]);
         // }

         // //now result
         // int water=0;
         // for(int i=1;i<n-1;i++)
         // {
         //     water+=(Math.min(lmax[i],rmax[i])-A[i]);
         // }
         // return water;

         Stack<Integer> s=new Stack<>();
         int ans=0;
         for(int i=0;i<A.length;i++)
         {
             while(!s.isEmpty() &&(A[i]>A[s.peek()]))
             {
                 int top=A[s.peek()];
                 s.pop();

                 if(s.isEmpty()) break;

                 int distance=i-s.peek()-1;

                 int boundedHeight=Math.min(A[i],A[s.peek()])-top;
                 ans+=distance*boundedHeight;
             }
             s.push(i);
         }
         return ans;
     }
 }
