Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

NOTE : The path has to end on a leaf node.

Example :

         1
        /
       2
min depth = 2.



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
    public int minDepth(TreeNode A) {
        if (A == null)
            return Integer.MAX_VALUE;
        if (A.left == null && A.right == null)
            return 1;
        else {
            return 1 + Math.min(minDepth(A.left),minDepth(A.right));
        }
    }
}
