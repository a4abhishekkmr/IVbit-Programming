public class Solution {
    public int solve(String A) {
        ArrayDeque<Character> s=new ArrayDeque<>();
        for(int i=0;i<A.length();i++)
        {
            Character x=A.charAt(i);
            if(x=='{' || x=='[' || x=='(')
            s.push(x);
            else
            {
                if(s.isEmpty())
                    return 0;
               else if( (s.peek()=='{' && x=='}') || (s.peek()=='(' && x==')')  || (s.peek()=='[' &&x==']') )
                    s.pop();
                else
                return 0;
            }
        }
        if(s.isEmpty()) return 1;
        else return 0;
    }
}
