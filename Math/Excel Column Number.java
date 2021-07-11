Problem Description

Given a column title A as appears in an Excel sheet, return its corresponding column number.



Example Output
Output 1:

 "A"
Output 2:

 "AB"


Example Explanation
Explanation 1:

 1 -> "A"
Explanation 2:

A  -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28




public class Solution {
    public int titleToNumber(String A) {
        int value=0;
        int n=A.length();
        int index=0;
        while(n-->0)
        {
            char c=A.charAt(index);
            int a=Character.getNumericValue(c)-9;
            System.out.println(a);
            value=value*26+a;
            index++;
        }
        return value;
    }
}
