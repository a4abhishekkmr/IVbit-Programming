**Example Input**
Input 1:

 A = 4
Input 2:

 A = 5


**Example Output**
Output 1:

 0
Output 2:

 1


**Example Explanation**
Explanation 1:

 4! = 24
Explanation 2:

 5! = 120





 public class Solution {
    public int trailingZeroes(int A) {
        int count=0;
        int i=5;
        while(i<=A)
        {

            int a=A/i;
            count+=a;
            i=i*5;
        }
return count;
    }

}
