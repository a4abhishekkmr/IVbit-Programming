Example:

Input:[3 1 2 5 3]

Output:[3, 4]

A = 3, B = 4

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] arr) {
        Map<Integer,Boolean> mp=new HashMap<Integer,Boolean>();
        int n=A.length;
        int repeat=-1;
        for(int i=0;i<n;i++)
        {
            if(mp.get(A[i])==null)
            mp.put(A[i],true);
            else
            repeat=A[i];
        }
        int missing=-1;
        //now check for missing
        for(int i=1;i<=n;i++)
        {
            if(mp.get(i)==null)
            missing=i;
        }
        // System.out.println(repeat);
        // System.out.println(missing);
        int arr[]=new int[2];
        arr[0]=repeat;
        arr[1]=missing;

        return arr;

        // int ans[]=new int[2];
        // int n=arr.length;
        // int a[]=new int[n];
        // Arrays.sort(arr);
        // for(int i=0;i<n;i++)
        // a[i]=i+1;

        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]!=arr[i])
        //     {
        //         ans[0]=arr[i];
        //         ans[1]=a[i];
        //         break;
        //     }
        // }

        // return ans;
    }
}
