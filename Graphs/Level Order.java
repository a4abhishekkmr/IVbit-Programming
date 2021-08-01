Problem Description

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).



Example Input
Input 1:

    3
   / \
  9  20
    /  \
   15   7
Input 2:

   1
  / \
 6   2
    /
   3


Example Output
Output 1:

 [
   [3],
   [9, 20],
   [15, 7]
 ]
Output 2:

 [
   [1]
   [6, 2]
   [3]
 ]





public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(A==null) return al;
        q.add(A);

        ArrayList<Integer>List=new ArrayList<>();
        while(!q.isEmpty())
        {

            int currLevel = q.size();
            for(int i=0;i<currLevel;i++)
            {

            TreeNode curr = q.poll();
            List.add(curr.val);

            if(curr.left != null)
                q.offer(curr.left);


            if(curr.right!= null)
                q.offer(curr.right);

            }

            al.add(new ArrayList<Integer>(List));
            List.clear();

        }
        return al;
    }
}
