Problem Description

Given a string A consisting of lowercase characters.

You have to find the number of substrings in A which starts with vowel and end with consonants or vice-versa.

Return the count of substring modulo 109 + 7.



Problem Constraints
1 <= |A| <= 105

A consists only of lower-case characters.



Input Format
First argument is an string A.



Output Format
Return a integer denoting the the number of substrings in A which starts with vowel and end with consonants or vice-versa with modulo 109 + 7.



Example Input
Input 1:

 A = "aba"
Input 2:

 A = "a"


Example Output
Output 1:

 2
Output 2:

 0


Example Explanation
Explanation 1:

 Substrings of S are : [a, ab, aba, b, ba, a]Out of these only 'ab' and 'ba' satisfy the condition for special Substring. So the answer is 2.
Explanation 2:

 No possible substring that start with vowel and end with consonant or vice-versa.




 public class Solution {
    public int solve(String A) {
        char[] arr=A.toCharArray();
        int n=A.length();
        // co[i] is going to store counts
    // of consonants from str[len-1]
    // to str[i].
    // vo[i] is going to store counts
    // of vowels from str[len-1]
    // to str[i].
        int co[]=new int[n+1];
        int vo[]=new int[n+1];

// Counting consonants and vowels
    // from end of string.
        if(vowel(arr[n-1])==true)
        vo[n-1]=1;
        else
        co[n-1]=1;

        for(int i=n-2;i>=0;i--)
        {
            if(vowel(arr[i])==true)
            {
                vo[i]=vo[i+1]+1;
                co[i]=co[i+1];
            }
            else
            {
                co[i]=co[i+1]+1;
                vo[i]=vo[i+1];
            }
        }
        long ans=0;

          // Now we traverse string from beginning
        for(int i=0;i<n;i++)
        {// If vowel, then count of substrings
        // starting with str[i] is equal to
        // count of consonants after it.
            if(vowel(arr[i]))
            ans=(ans%1000000007+co[i+1]%1000000007);
            // If consonant, then count of
        // substrings starting with str[i]
        // is equal to count of vowels
        // after it.
            else
            ans=ans%1000000007+vo[i+1]%1000000007;
        }
        return (int)ans%1000000007;
    }
    boolean vowel(char x)
    {return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');}
}
