Given an array of integers A of size N. A represents a histogram i.e A[i] denotes height of

the ith histogram’s bar. Width of each bar is 1.

Largest Rectangle in Histogram: Example 1

Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].

Largest Rectangle in Histogram: Example 2

The largest rectangle is shown in the shaded area, which has area = 10 unit.

Find the area of largest rectangle in the histogram.




Input Format

The only argument given is the integer array A.
Output Format

Return the area of largest rectangle in the histogram.
For Example

Input 1:
    A = [2, 1, 5, 6, 2, 3]
Output 1:
    10
    Explanation 1:
        The largest rectangle is shown in the shaded area, which has area = 10 unit.






        public class Solution {
            public int largestRectangleArea(int[] A) {
                Stack<Integer> s= new Stack<>();
                int area=0,maxarea=0;
                s.push(0);
                for(int i=1;i<A.length;i++)
                {
                    while(s.isEmpty()==false && A[s.peek()]>=A[i])
                    {
                        int top=s.pop();
                        int l=(s.isEmpty()==true)?i:i-s.peek()-1;
                        area=A[top]*l;
                        maxarea=Math.max(area,maxarea);
                    }
                    s.push(i);
                }
                while(s.isEmpty()==false)
                    {
                        int top=s.pop();
                        int l=(s.isEmpty()==true)?A.length:A.length-s.peek()-1;
                        area=A[top]*l;
                        maxarea=Math.max(area,maxarea);
                    }
                    return maxarea;
            }
        }
