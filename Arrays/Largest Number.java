Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.
  
  
  
  public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        //final read ONLY
        String strarr[]=new String[A.length];
        for(int i=0;i<A.length;i++)
        {
            strarr[i]=String.valueOf(A[i]);
        }
        //converted to string array
        //Now magic started
        //creted a comparator 
        Comparator <String> comp= new Comparator<String>()
        {
            @Override
            public int compare(String s1, String s2)
            {
                String str1=s1+s2;
                String str2=s2+s1;
                return str2.compareTo(str1);
            }
        };
        Arrays.sort(strarr,comp);
        // for(int i=0;i<A.length;i++)
        // System.out.println(strarr[i]);

        //Handle a case when all inputs are 0,0,0.. output will be 0
        if(strarr[0].charAt(0)=='0')
        return "0";

        //now needed to crete string from  strarr
        StringBuilder sb = new StringBuilder();
        for(String x:strarr)
        {
            sb.append(x);
        }
        return sb.toString();
    }
}
