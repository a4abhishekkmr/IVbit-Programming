Problem Description

Given a binary tree, return the reverse level order traversal of its nodes values. (i.e, from left to right and from last level to starting level).




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

 [15, 7, 9, 20, 3]
Output 2:

 [3, 6, 2, 1]






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
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        Stack<TreeNode> st=new Stack<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(A);
        while(q.isEmpty()==false)
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=q.poll();
                st.add(curr);

                if(curr.right!=null) q.add(curr.right);
                if(curr.left!=null) q.add(curr.left);

            }
        }
        while(st.isEmpty()==false)
        {
            TreeNode tmp=st.pop();
            al.add(tmp.val);
        }
        return al;
    }
}
