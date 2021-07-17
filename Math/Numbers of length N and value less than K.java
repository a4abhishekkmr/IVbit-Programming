Given a set of digits (A) in sorted order, find how many numbers of  length B are possible whose value is less than number C.

NOTE:  All numbers can only have digits from the given set.

Examples:

	Input:
	  0 1 5
	  1
	  2
	Output:
	  2 (0 and 1 are possible)

	Input:
	  0 1 2 5
	  2
	  21
	Output:
	  5 (10, 11, 12, 15, 20 are possible)



    public class Solution {
    public int solve(int[] a, int b, int t) {
        int n=a.length;
        String s=String.valueOf(t);
        int m=s.length();

        if(n==0 || b>m) return 0;

        if(b<m){
            if(a[0]==0 && b!=1) return (n-1) * (int)Math.pow(n,b-1);
            else return (int)Math.pow(n,b);
        }

        int ans=0;
        for(int i=0;i<m;i++){
            int x=(int)(s.charAt(i)-'0');
            int count=0;
            int j=0;
            while(j<n && a[j]<x){
                j++;
                count++;
            }

            if(i==0&&a[0]==0 && b>1) count--;
            ans+=count*(int)Math.pow(n,b-1);
            if(j==n|| a[j]!=x) return ans;
            b--;
            //System.out.println(ans);
        }

        return ans;
    }
}

public class Solution {
    int[] numToVec(int N) {
        List<Integer> digit = new ArrayList<>();
        while (N != 0) {
            digit.add(N % 10);
            N = N / 10;
        }
        if (digit.size() == 0) {
            digit.add(0);
        }

        Collections.reverse(digit);

        int[] toReturn = new int[digit.size()];
        for (int i = 0; i < digit.size(); i++) {
            toReturn[i] = digit.get(i);
        }
        return toReturn;
    }
