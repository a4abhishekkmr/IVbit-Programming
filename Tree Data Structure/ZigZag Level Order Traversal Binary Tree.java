Given a binary tree, return the zigzag level order traversal of its nodes’ values. (ie, from left to right, then right to left for the next level and alternate between).

Example :

Given binary tree

    3
   / \
  9  20
    /  \
   15   7
return

[
         [3],
         [20, 9],
         [15, 7]
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
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
         ArrayList<ArrayList<Integer>> al= new ArrayList<ArrayList<Integer>>();
        if(A==null) return al;
        Stack<TreeNode> curr=new Stack<>();
        Stack<TreeNode> next=new Stack<>();

        curr.push(A);
        //boolean sahi=true;

        while(curr.isEmpty()==false || next.isEmpty()==false)
        {ArrayList<Integer> ans1=new ArrayList<>();
        ArrayList<Integer> ans2=new ArrayList<>();
           //ans.clear();
            while(curr.isEmpty()==false)
            {
                TreeNode temp=curr.pop();
                ans1.add(temp.val);

            if(temp.left!=null)
            next.push(temp.left);
            if(temp.right!=null)
            next.push(temp.right);}

            if(ans1.isEmpty()==false)
            al.add(ans1);

        while(next.isEmpty()==false)
            {
            TreeNode temp=next.pop();
                ans2.add(temp.val);

            if(temp.right!=null)
            curr.push(temp.right);
            if(temp.left!=null)
            curr.push(temp.left);

        }

            if(ans2.isEmpty()==false)
            al.add(ans2);


        }//end of while
        return al;
    }
}
