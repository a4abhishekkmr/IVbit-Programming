Given a binary tree, return the postorder traversal of its nodes’ values.

Example :

Given binary tree

   1
    \
     2
    /
   3
return [3,2,1].

Using recursion is not allowed.


https://www.geeksforgeeks.org/iterative-postorder-traversal/


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
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> al= new ArrayList<Integer>();
        Stack <TreeNode> s1=new Stack<TreeNode>();
        Stack <TreeNode> s2=new Stack<TreeNode>();

        s1.push(A);
        while(s1.isEmpty()==false)
        {// Pop an item from s1 and push it to s2
            TreeNode temp=s1.pop();
            s2.push(temp);

            // Push left and right children of
            // removed item to s1
            if(temp.left!=null)
            s1.push(temp.left);
            if(temp.right!=null)
            s1.push(temp.right);
        }
        //print all from s2
        while(s2.isEmpty()==false)
        {TreeNode temp1=s2.pop();
            al.add(temp1.val);
        }
        return al;
    }
}
