For Given Number N find if its COLORFUL number or not

Return 0/1

COLORFUL number:

A number can be broken into different contiguous sub-subsequence parts.
Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245.
And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different
Example:

N = 23
2 3 23
2 -> 2
3 -> 3
23 -> 6
this number is a COLORFUL number since product of every digit of a sub-sequence are different.

Output : 1





public class Solution {
    public int colorful(int A) {
        String s = String.valueOf(A);
        int n=s.length();
            HashSet<Integer> hs=new HashSet<>();

        int pro=1;
        for(int i=0;i<n;i++)
        {pro=1;
            for(int j=i;j<n;j++)
            {
                pro*=Character.getNumericValue(s.charAt(j));
                if(hs.contains(pro))
                return 0;

            hs.add(pro);}
        }

        return 1;
    }
}
