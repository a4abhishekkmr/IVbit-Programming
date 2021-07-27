
Example Input
Input 1:

 A = [  [1, 2, 3]
        [2, 4, 6]
        [0, 9, 10]
     ]


Example Output
Output 1:

 [0, 1, 2, 2, 3, 4, 6, 9, 10]


Example Explanation
Explanation 1:

 You need to merge [1, 2, 3] , [2, 4, 6] and [0, 9, 10]  into a single array
 so the merged array will look like [0, 1, 2, 2, 3, 4, 6, 9, 10]




 public class Solution {
class Triplet implements Comparable<Triplet>{
    int val,aPos,vPos;
    Triplet(int v,int ap, int vp){
        val=v;aPos=ap;vPos=vp;
    }
    public int compareTo(Triplet t){
        if(val<=t.val)return -1;
        else return 1;
    }
}
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> res= new ArrayList<Integer>();
        PriorityQueue<Triplet> pq=new PriorityQueue<Triplet>();

        for(int i=0;i<A.size();i++)
        {
            pq.add(new Triplet(A.get(i).get(0),i,0));
        }

        while(!pq.isEmpty())
        {
            Triplet curr=pq.poll();
            res.add(curr.val);
            int ap=curr.aPos, vp=curr.vPos;

            if(vp+1<A.get(ap).size())
            pq.add(new Triplet(A.get(ap).get(vp+1),ap,vp+1));
        }

        return res;
    }
}
