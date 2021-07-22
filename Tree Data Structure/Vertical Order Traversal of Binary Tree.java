Problem Description

Given a binary tree A consisting of N nodes, return a 2-D array denoting the vertical order traversal of A.

Go through the example and image for more details.

NOTE:

If 2 or more Tree Nodes shares the same vertical level then the one with earlier occurence in the pre-order traversal of tree comes first in the output.
Row 1 of the output array will be the nodes on leftmost vertical line similarly last row of the output array will be the nodes on the rightmost vertical line.



Example Input
Input 1:

      6
    /   \
   3     7
  / \     \
 2   5     9
Input 2:

           1
         /   \
        2     3
       / \
      4   5


Example Output
Output 1:

 [
    [2],
    [3],
    [6, 5],
    [7],
    [9]
 ]
Output 2:

 [
    [4],
    [2],
    [1, 5],
    [3]
 ]






 /**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {


    class Pair{
        TreeNode node;
        int h;
        Pair(int h,TreeNode node)
        {
            this.h=h;
            this.node=node;
        }
    }
    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();

        if(A==null) return al;
        TreeMap<Integer,ArrayList<Integer>> m=new TreeMap<Integer,ArrayList<Integer>>();
        int h=0;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(0,A));

        while(!q.isEmpty())
        {//ArrayList<Integer> ans=new ArrayList<Integer>();
            TreeNode temp=q.peek().node;
            int ht=q.peek().h;
            q.remove();

            if(m.containsKey(ht)==false)
            {
                ArrayList<Integer> ans=new ArrayList<Integer>();
                ans.add(temp.val);
                m.put(ht,ans);
            }
            else
            {
                m.get(ht).add(temp.val);
            }

            if(temp.left!=null)
            q.add(new Pair(ht-1,temp.left));

            if(temp.right!=null)
            q.add(new Pair(ht+1,temp.right));

        }
        for(ArrayList<Integer>ans:m.values())
        {
            al.add(ans);
        }
        return al;
}}
