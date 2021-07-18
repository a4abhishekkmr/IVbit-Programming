Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example:

"A man, a plan, a canal: Panama" is a palindrome.

"race a car" is not a palindrome.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem



public class Solution {
    public int isPalindrome(String A) {
        int begin=0;
        int end=A.length()-1;
        while(begin<end)
        {
            //char a=A.charAt(begin);
            while(!Character.isLetterOrDigit(A.charAt(begin)) && begin<end)
            begin++;
            // char b=A.charAt(end);
            while(!Character.isLetterOrDigit(A.charAt(end)) && end>begin)
            end--;

            if(Character.toUpperCase(A.charAt(begin))!=Character.toUpperCase(A.charAt(end)))
            return 0;

            begin++;
            end--;
        }
        return 1;
    }
}
