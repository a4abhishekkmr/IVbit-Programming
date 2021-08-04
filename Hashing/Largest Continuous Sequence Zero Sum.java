Find the largest continuous sequence in a array which sums to zero.

Example:


Input:  {1 ,2 ,-2 ,4 ,-4}
Output: {2 ,-2 ,4 ,-4}



public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        int n=A.size();

        HashMap<Integer,Integer> map=new HashMap<>();

        //map.put(0,-1);
        int start=-1,end=-1;
        int sum=0;
        int length=-1;

        for(int i=0;i<n;i++)
        {
            sum+=A.get(i);
            if(sum==0)
            {start=0;end=i;length=i+1;}
            if(map.containsKey(sum))
            {
                if(length<(i-map.get(sum)))
                {
                    start=map.get(sum)+1;
                    end=i;
                    length=i-map.get(sum);
                }
            }
            else
            map.put(sum,i);
        }
        ArrayList<Integer> result=new ArrayList<>();
        if(start>=0 && end>=0)
        {
            for(int i=start;i<=end;i++)
            result.add(A.get(i));
        }
        return result;
    }
}
