Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

Example :

Given the below binary tree and sum = 22,

              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

Return 0 / 1 ( 0 for false, 1 for true ) for this problem




public class Solution {
    public int hasPathSum(TreeNode A, int B) {
        return (helper(A,0,B)==true)?1:0;

    }
    boolean helper(TreeNode A,int ans, int B)
    {
        if(A==null) return false;
       int prod=(ans+A.val);

        if(A.left==null && A.right==null)
        return (prod==B);
        //int a=helper(A.left,ans);
        //int b=helper(A.right,ans);

    return helper(A.left,prod,B)||helper(A.right,prod,B);


    }
}
