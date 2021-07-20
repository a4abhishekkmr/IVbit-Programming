Given a binary search tree, write a function to find the kth smallest element in the tree.

Example :

Input :
  2
 / \
1   3

and k = 2

Return : 2

As 2 is the second smallest element in the tree.
NOTE : You may assume 1 <= k <= Total number of nodes in BST







public class Solution {
    ArrayList<Integer> ans;
    public int kthsmallest(TreeNode A, int B) {
        ans = new ArrayList<>();
        trav(A);
        return ans.get(B-1);
    }
    public void trav(TreeNode root){
        if(root==null)return;
        trav(root.left);
        ans.add(root.val);
        trav(root.right);
    }
}
