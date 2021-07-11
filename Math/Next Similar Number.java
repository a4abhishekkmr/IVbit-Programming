Problem Description

Given a number A in a form of string.

You have to find the smallest number that has same set of digits as A and is greater than A.

If A is the greatest possible number with its set of digits, then return -1.


public class Solution {
    public String solve(String A) {
        int l=A.length();
        //String ans="-1";
        char[] ch = A.toCharArray();
        int arr[]= new int[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=ch[i]-'0';
        }
        int i=0;
        for(i=l-1;i>0;i--)
        if(arr[i]>arr[i-1])
        break;

        if(i==0)
        return "-1";

        int p=arr[i-1];
        int min=i;

        for(int j=i+1;j<l;j++)
        {
            if(arr[j]>p && arr[j]<arr[min])
            min=j;
        }
        int temp = arr[i-1];
        arr[i-1] = arr[min];
        arr[min] = temp;

        Arrays.sort(arr,i,l);


        // for(int i=0;i<l;i++)
        // System.out.print(arr[i]);

        StringBuffer s = new StringBuffer();
        String str1="";
        s.append(arr[0]);
        for( i =1;i <l ; i++)
        {
            s.append(str1).append(arr[i]);
        }


        return  s.toString();
}
}
