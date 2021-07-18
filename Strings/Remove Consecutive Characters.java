Example Input
Input 1:

A = "aabcd"
B = 2
Input 2:

A = "aabbccd"
B = 2


Example Output
Output 1:

 "bcd"
Output 2:

 "d"


Example Explanation
Explanation 1:

 "aa" had length 2.
Explanation 2:

 "aa", "bb" and "cc" had length of 2.




public class Solution {
    public String solve(String A, int B) {
        int count[]=new int[A.length()];
        count[A.length()-1]=1;

        for(int i=A.length()-2;i>=0;i--)
        {
            if(A.charAt(i)==A.charAt(i+1))
            count[i]=count[i+1]+1;
            else
            count[i]=1;
        }
        // for(int x:count)
        // System.out.print(x);
        String ans="";
        int i=0;
        while(i<A.length())
        {
            if(count[i]!=B)
            {int j=0;
                while(j<count[i])
                {ans=ans+A.charAt(j+i);j++;}
                i=count[i]+i;

            }
            else if(count[i]==B)
            {
                i+=B;
            }
            // else
            // {
            //     {ans=ans+A.charAt(i);i++;}
            // }
        }
        return ans;


    }
}



Editorial
public class Solution {
    public String solve(String A, int B) {
        StringBuilder sb=new StringBuilder();
        Character prev=A.charAt(0);
        sb.append(prev);
        //daal do baad me dekhenge count kitna  hai ni agar B hua to htaao ni to rhe do
        int count=1;
        //chal check kre
        for(int i=1;i<A.length();i++)
        {
            Character curr=A.charAt(i);
            if(prev==curr)
            count++;
            else
            count=1;
            sb.append(curr);
            if(count==B)
            {
                sb.delete(sb.length()-B,sb.length());
                count=0;
            }
            prev=curr;
        }
        return String.valueOf(sb);
    }
}
