Given a string A.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.

Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.

If there are multiple spaces between words, reduce them to a single space in the reversed string.




Input Format

The only argument given is string A.
Output Format

Return the string A after reversing the string word by word.
For Example

Input 1:
    A = "the sky is blue"
Output 1:
    "blue is sky the"

Input 2:
    A = "this is ib"
Output 2:
    "ib is this"






    public class Solution {
    public String solve(String A) {
        //int n=A.length();

        A=A.trim();//this is used to remove front and last spaces
        A = A.replaceAll("( )+", " ");
        int n=A.length();
        char[] str=A.toCharArray();
        int begin=0;
        for(int end=0;end<n;end++)
        {
            if(str[end]==' ')
            {reverse(str,begin,end-1);
            while(str[end]==' ')
            end++;
            begin=end;}
        }
        reverse(str,begin,n-1);//this is for last
        reverse(str,0,n-1);//this is whole reverse

        return String.valueOf(str);
    }
    void reverse(char str[],int low,int high)
    {
        while(low<=high)
        {
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;

            low++;
            high--;
        }
    }
}



Editorial

public class Solution {
    public String solve(String A) {
        int i=0,j;
        int n=A.length();
        String res="";
        while(i<n){
            while(i<n&&A.charAt(i)==' '){
                i++;
            }
            if(i>=n){
                break;
            }
            j=i+1;
            while(j<n && A.charAt(j)!=' '){
                j++;
            }
            String w=A.substring(i,j);
            if(res.length()==0){
                res=w;
            }
            else{
                res=w+" "+res;
            }
            i=j+1;
        }
        return res;
    }
}
