Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.




Input Format

The only argument given is character array A.
Output Format

Return the value of arithmetic expression formed using reverse Polish Notation.
For Example

Input 1:
    A =   ["2", "1", "+", "3", "*"]
Output 1:
    9
Explaination 1:
    starting from backside:
    *: ( )*( )
    3: ()*(3)
    +: ( () + () )*(3)
    1: ( () + (1) )*(3)
    2: ( (2) + (1) )*(3)
    ((2)+(1))*(3) = 9

Input 2:
    A = ["4", "13", "5", "/", "+"]
Output 2:
    6
Explaination 2:
    +: ()+()
    /: ()+(() / ())
    5: ()+(() / (5))
    1: ()+((13) / (5))
    4: (4)+((13) / (5))
    (4)+((13) / (5)) = 6




    public class Solution {
    public int evalRPN(String[] A) {
        Stack<String> st=new Stack<String>();
        for(int i=0;i<A.length;i++)
        {
            if(A[i].equals("+") ||A[i].equals("-") ||A[i].equals("*") ||A[i].equals("/"))
            {
                int b=Integer.valueOf(st.pop());
                int a=Integer.valueOf(st.pop());
                int c=0;
                if(A[i].equals("+"))
                c=a+b;
                else if(A[i].equals("-"))
                c=a-b;
                else if(A[i].equals("*"))
                c=a*b;
                else
                c=a/b;

                st.push(String.valueOf(c));
            }
            else
            st.push(A[i]);
        }
        return Integer.parseInt(st.peek());
    }
}
