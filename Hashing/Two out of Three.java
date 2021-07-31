Problem Description

Given are Three arrays A, B and C.

Return the sorted list of numbers that are present in atleast 2 out of the 3 arrays.



Example Input
Input 1:

A = [1, 1, 2]
B = [2, 3]
C = [3]
Input 2:

A = [1, 2]
B = [1, 3]
C = [2, 3]


Example Output
Output 1:

[2, 3]
Output 2:

[1, 2, 3]


Example Explanation
Explanation 1:

1 is only present in A. 2 is present in A and B. 3 is present in B and C.
Explanation 2:

All numbers are present in atleast 2 out of 3 lists.





public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        HashSet<Integer> h=new HashSet<Integer>();
        HashSet<Integer> h1=new HashSet<Integer>();
        HashSet<Integer> h2=new HashSet<Integer>();
         for(int i=0;i<A.size();i++)
        h.add(A.get(i));
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<B.size();i++)
        {

            h1.add(B.get(i));
        }
        for(int i=0;i<C.size();i++)
        {
            // if(h.contains(C.get(i)) && al.contains(C.get(i))==false)
            // {
            //     al.add(C.get(i));
            // }
            // else
            h2.add(C.get(i));
        }
        // HashSet<Integer> hs=new HashSet<Integer>();
        // for(int i=0;i<al.size();i++)
        // hs.add(al.get(i));
        // al.clear();
        // for(int e:hs)
        // al.add(e);
        HashSet<Integer> h3=new HashSet<Integer>();
        for(int i:h)
        if(h2.contains(i)||h1.contains(i))
        h3.add(i);

        for(int i:h1)
        if(h2.contains(i)||h.contains(i))
        h3.add(i);

        for(int i:h3)
        al.add(i);

        Collections.sort(al);
        return al;
    }
}



Editorial:-
public class Solution {
    public int[] solve(int[] A, int[] B, int[] C) {
        if(A == null || B == null || C == null) return null;

        HashMap<Integer, Lists> map = new HashMap<>();

        for(int i = 0; i<A.length; i++){
            int curr = A[i];
            if(map.containsKey(curr)){
                map.get(curr).A = true;
            }
            else{
                Lists list = new Lists();
                list.A = true;
                map.put(curr, list);
            }
        }
        for(int i = 0; i<B.length; i++){
            int curr = B[i];
            if(map.containsKey(curr)){
                map.get(curr).B = true;
            }
            else{
                Lists list = new Lists();
                list.B = true;
                map.put(curr, list);
            }
        }
        for(int i = 0; i<C.length; i++){
            int curr = C[i];
            if(map.containsKey(curr)){
                map.get(curr).C = true;
            }
            else{
                Lists list = new Lists();
                list.C = true;
                map.put(curr, list);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Lists> entry : map.entrySet()){
            //System.out.println(entry.getKey());
            Lists curr = entry.getValue();
            //System.out.println("For entry key " + entry.getKey() + " " + curr == null);
            //System.out.println(curr == null);
            //System.out.println(curr.B);
            int count = 0;
            if(curr.A) count++;
            if(curr.B) count++;
            if(curr.C) count++;
            if(count >= 2) res.add(entry.getKey());
        }

        Collections.sort(res);
        int[] ans = new int[res.size()];

        for(int i = 0; i<res.size(); i++){
            ans[i] = res.get(i);
        }

        return ans;
    }
}

class Lists{
    boolean A;
    boolean B;
    boolean C;
    public Lists(){
        A = false;
        B = false;
        C = false;
    }
}

Close
