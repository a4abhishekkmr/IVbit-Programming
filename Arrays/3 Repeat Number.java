You’re given a read only array of n integers. Find out if any integer occurs more than n/3 times in the array in linear time and constant additional space.

If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.

Example :

Input : [1 2 3 1 1]
Output : 1 
1 occurs 3 times which is more than 5/3 times. 
  

public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> al) {
        int n=al.size();
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int count1=0,count2=0,i=0;
        for(i=0;i<n;i++)
        {
            if(al.get(i)==first && count1>0)
            {
                count1++;
            }
            else if(al.get(i)==second && count2>0)
            {
                count2++;
            }
            else if(count1==0)
            {
                first=al.get(i);
                count1=1;
            }
            else if(count2==0)
            {
                second=al.get(i);
                count2=1;
            }
            else
            {
                count1--;
                count2--;
            }
        }

        if(count1==0 && count2==0)
        return -1;

        //reset
        count1=0;count2=0;
        for(i=0;i<n;i++)
        {
            if(al.get(i)==first) count1++;
            if(al.get(i)==second) count2++;
        }
        if(count1>n/3) return first;
        else if(count2>n/3) return second;
        else return -1;
    }
}
//TC=O(n) and space O(1)
