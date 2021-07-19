Given a binary tree, return the inorder traversal of its nodes’ values.

Example :

Given binary tree

   1
    \
     2
    /
   3
return [1,3,2].

Using recursion is not allowed.




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
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> al= new ArrayList<Integer>();
        Stack <TreeNode> st=new Stack<TreeNode>();
        TreeNode curr=A;
        while(curr!=null || st.isEmpty()==false)
        {
            while(curr!=null)
            {
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            al.add(curr.val);
            curr=curr.right;
        }
        return al;
    }
}
