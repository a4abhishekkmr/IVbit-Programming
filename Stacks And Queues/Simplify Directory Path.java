Given a string A representing an absolute path for a file (Unix-style).

Return the string A after simplifying the absolute path.

Note:

Absolute path always begin with ’/’ ( root directory ).

Path will not have whitespace characters.




Input Format

The only argument given is string A.
Output Format

Return a string denoting the simplified absolue path for a file (Unix-style).
For Example

Input 1:
    A = "/home/"
Output 1:
    "/home"

Input 2:
    A = "/a/./b/../../c/"
Output 2:
    "/c"







    public class Solution {
    public String simplifyPath(String A) {

        // if(A==null||A.length()==0)
        // return null;

        A=(String)A.subSequence(1,A.length());
        String[] arr=A.split("/");
        Deque<String> st = new LinkedList<String>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(".."))  //linux wla command to get back
                {if(!st.isEmpty())
                    st.pop();}
                else if(arr[i].matches("[a-zA-Z]+"))
                    st.push("/"+arr[i]);
        }
        StringBuilder sb=new StringBuilder();

        if(st.isEmpty())
        return "/";

        while(!st.isEmpty())
        sb.append(st.removeLast());


        return sb.toString();
    }
}
