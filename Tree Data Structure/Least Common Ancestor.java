Find the lowest common ancestor in an unordered binary tree given two values in the tree.

Lowest common ancestor : the lowest common ancestor (LCA) of two nodes v and w in a tree or directed acyclic graph (DAG) is the lowest (i.e. deepest) node that has both v and w as descendants.

Example :


        _______3______
       /              \
    ___5__          ___1__
   /      \        /      \
   6      _2_     0        8
         /   \
         7    4
For the above tree, the LCA of nodes 5 and 1 is 3.

LCA = Lowest common ancestor

Please note that LCA for nodes 5 and 4 is 5.

You are given 2 values. Find the lowest common ancestor of the two nodes represented by val1 and val2
No guarantee that val1 and val2 exist in the tree. If one value doesn’t exist in the tree then return -1.
There are no duplicate values.
You can use extra memory, helper functions, and can modify the node struct but, you can’t add a parent pointer.





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
    public int lca(TreeNode A, int B, int C) {
        //if(A==null) return -1;
        if(search(A,B)==false || search(A,C)==false)
         return -1;

        else
        {TreeNode ans=helper(A,B,C);
        if(ans==null) return -1;
        else
        return ans.val;}

    }
    TreeNode helper(TreeNode A,int B,int C)
    {
        if(A==null) return null;
        if(A.val==B || A.val==C)
        return A;

        TreeNode left=helper(A.left,B,C);
        TreeNode right=helper(A.right,B,C);

        if(left!=null && right!=null)
        return A;

        return (left!=null) ?left:right;
    }
    boolean search(TreeNode A, int B)
    {
        if(A==null) return false;
        if(A.val == B) return true;

       return (search(A.left,B) || search(A.right,B));
    }
}
