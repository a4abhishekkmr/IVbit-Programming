Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers % 1003.

Example :

    1
   / \
  2   3
The root-to-leaf path 1->2 represents the number 12.

The root-to-leaf path 1->3 represents the number 13.

Return the sum = (12 + 13) % 1003 = 25 % 1003 = 25.




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
    int mod=1003;
    public int sumNumbers(TreeNode A) {

        int ans=0;
        int hello=helper(A,ans);

        return hello%mod;


    }
    int helper(TreeNode A,int ans)
    {
        if(A==null) return 0;
        ans=(ans*10+A.val)%mod;

        if(A.left==null && A.right==null)
        return ans;
        //int a=helper(A.left,ans);
        //int b=helper(A.right,ans);

        return (helper(A.left,ans)+helper(A.right,ans))%mod;
    }
}
