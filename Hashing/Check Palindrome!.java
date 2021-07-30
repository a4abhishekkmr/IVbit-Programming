Problem Description

Given a string A consisting of lowercase characters.

Check if characters of the given string can be rearranged to form a palindrome.

Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Problem Constraints
1 <= |A| <= 105

A consists only of lower-case characters.



Input Format
First argument is an string A.



Output Format
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Example Input
Input 1:

 A = "abcde"
Input 2:

 A = "abbaee"


Example Output
Output 1:

 0
Output 2:

 1







 public class Solution {
    public int solve(String A) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=A.length();
        for(int i=0;i<n;i++)
        {
            char s=A.charAt(i);
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int m=map.size();
        // boolean flag=false;
        //  if(m%2==0)
        //     {
        //          for(Map.Entry<Character,Integer> e:map.entrySet())
        //             {
        //                 if(e.getValue()%2!=0)
        //                 return 0;
        //              }
        //     }
        //     else
        //     {int count=0;
        //         for(Map.Entry<Character,Integer> e:map.entrySet())
        //             {
        //                 if(e.getValue()%2!=0)
        //                 {
        //                     count++;
        //                 }

        //              }
        //              if(count>1)
        //                 return 0;
        //     }
        //     return 1;
        int flag=0;
        for(Map.Entry<Character, Integer> e : map.entrySet())
            if((e.getValue()%2)!=0)   flag++;
        return flag<2?1:0;

    }
}
