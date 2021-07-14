For Example

Input 1:
    A = "((a + b))"
Output 1:
    1
    Explanation 1:
        ((a + b)) has redundant braces so answer will be 1.

Input 2:
    A = "(a + (a + b))"
Output 2:
    0
    Explanation 2:
        (a + (a + b)) doesn't have have any redundant braces so answer will be 0.



        public class Solution {
    public int braces(String A) {
        ArrayDeque<Character> s=new ArrayDeque<>();
        for(int i=0;i<A.length();i++)
        {
            Character x=A.charAt(i);
            if(x=='(' ||x=='*' ||x=='/' ||x=='+' ||x=='-')
            s.push(x);

            if(A.charAt(i)==')')
            {
                if(s.peek()=='(')
                return 1;
                else{
                while(s.isEmpty()==false && s.peek()!='(')
                {s.pop();}
                s.pop();
                }
            }
        }
        return 0;

    }
}
