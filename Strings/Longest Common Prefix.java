Given the array of strings A,

you need to find the longest string S which is the prefix of ALL the strings in the array.

Longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1

and S2.

For Example, longest common prefix of "abcdefgh" and "abcefgh" is "abc".




Input Format

The only argument given is an array of strings A.
Output Format

Return longest common prefix of all strings in A.
For Example

Input 1:
    A = ["abcdefgh", "aefghijk", "abcefgh"]
Output 1:
    "a"
    Explanation 1:
        Longest common prefix of all the strings is "a".

Input 2:
    A = ["abab", "ab", "abcd"];
Output 2:
    "ab"
    Explanation 2:
        Longest common prefix of all the strings is "ab".






public class Solution {
    public String longestCommonPrefix(String[] A) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(A);
        //lexically sorted  like aaa gg fffff
        String begin=A[0];
        String end=A[A.length-1];
        int len=Math.min(begin.length(),end.length());

        for(int i=0;i<len;i++)
        {
            if(begin.charAt(i)==end.charAt(i))
            sb.append(begin.charAt(i));
            else
            break;
        }
        return String.valueOf(sb);
    }
}
