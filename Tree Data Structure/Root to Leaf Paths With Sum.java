Given a binary tree and a sum, find all root-to-leaf paths where each path’s sum equals the given sum.

For example:

Given the below binary tree and sum = 22,

              5
             / \
            4   8
           /   / \
          11  13  4
         /  \    / \
        7    2  5   1
return

[
   [5,4,11,2],
   [5,8,4,5]
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
    int currentsum=0;
    ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> ans1=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {

        //currentsum=0;
        helper(A,B);
        return al;


    }
        void helper(TreeNode A, int B)
     {//bc- when A reaches null
         if(A==null) return;
       //
        if(A.left==null && A.right==null && currentsum+A.val!=B)
        return;

        else if(A.left==null && A.right==null && currentsum+A.val==B)
        {
            ans1.add(A.val);
            al.add(new ArrayList<>(ans1));
            ans1.remove(ans1.size()-1);
            return;
        }

        ans1.add(A.val);
        currentsum+=A.val;

    helper(A.left,B);
    helper(A.right,B);

    currentsum-=A.val;
    ans1.remove(ans1.size()-1);
    }
}
