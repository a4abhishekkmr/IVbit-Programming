Problem Description

Given a positive integer A, return its corresponding column title as appear in an Excel sheet.

Example Input
Input 1:

 A = 1
Input 2:

 A = 28


Example Output
Output 1:

 "A"
Output 2:

 "AB"




 public class Solution {
    public String convertToTitle(int A) {
        int n=A;
        //if(A==1) return "A";
        String str="";
        while(n>=1)
        {
            //if(n==1) {str=str+"A";
            int c=n%26;
            int g=0;
            if(c==0) {c=26;n--;}
            g=c+64;

            str=str+(char)(g);
            //System.out.println(str);
            n=n/26;
        }
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        return sbr.toString();
    }
}
