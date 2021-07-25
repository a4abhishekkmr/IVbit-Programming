Given a binary tree, flatten it to a linked list in-place.

Example :

Given


         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:

   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
Note that the left child of all nodes should be NULL.


Using Solution:- better to go eith Editorial

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
     TreeNode head=new TreeNode(0);
     TreeNode cur=head;
	public TreeNode flatten(TreeNode a) {
	    //preorder traversal
	    preorder(a);
	    return head.right;
	}
	public void preorder(TreeNode a){
	    if(a==null){
	        return;
	    }
	    cur.right=new TreeNode(a.val);
	    cur=cur.right;
	    preorder(a.left);
	    preorder(a.right);
	}
}

Editorial:-
public class Solution {

    TreeNode next = null;
    public TreeNode flatten(TreeNode a) {
        flattenUtil(a);
        return next;
    }

    public void flattenUtil(TreeNode a) {

        if (a == null)
            return;
        flattenUtil(a.right);
        flattenUtil(a.left);
        a.right = next;
        next = a;
        next.left = null;
    }
}




Recursive approach:-
/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
	public TreeNode flatten(TreeNode a) {
		flat(a);
		return a;
	}
	void flat(TreeNode A)
	{
		if(A==null)
		return;

		if(A.left==null && A.right==null)
		return;

		if(A.left!=null)
		{
			flat(A.left);

			TreeNode temp=A.right;
			A.right=A.left;
			A.left=null;

			TreeNode curr=A.right;
			while(curr.right!=null)
			{
				curr=curr.right;
			}
			curr.right=temp;
		}
		flat(A.right);
	}
}
