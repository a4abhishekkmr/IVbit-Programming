Given a binary search tree T, where each node contains a positive integer, and an integer K, you have to find whether or not there exist two different nodes A and B such that A.value + B.value = K.

Return 1 to denote that two such nodes exist. Return 0, otherwise.

Notes

Your solution should run in linear time and not take memory more than O(height of T).
Assume all values in BST are distinct.
Example :

Input 1:

T :       10
         / \
        9   20

K = 19

Return: 1

Input 2:

T:        10
         / \
        9   20

K = 40

Return: 0




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
    public int t2Sum(TreeNode A, int B) {
        ArrayList<Integer> al=new ArrayList<>();
        Stack<TreeNode> st=new Stack<TreeNode>();
        //inorder
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

        int n=al.size();
        int low=0;
        int high=n-1;
        while(low<high)
        {
            if(al.get(low)+al.get(high)==B)
            return 1;
            else if((al.get(low)+al.get(high))>B)
            high--;
            else
            low++;
        }
        return 0;
    }
}



Editorial:-


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
    ArrayList<Integer> inorder = new ArrayList<Integer>();
    public int t2Sum(TreeNode A, int B)
    {
        in(A);
        int j = inorder.size()-1;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i:inorder)
        {
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        for(Integer i:inorder)
        {
            if(map.containsKey(B-i))
            {
                if(i==B-i)
                    if(map.get(i)>=2)
                        return 1;
                    else
                        continue;
                else
                    return 1;
            }
        }
        return 0;
    }
    public void in(TreeNode root)
    {
        if(root==null)
            return;

        in(root.left);
        inorder.add(root.val);
        in(root.right);
    }
}
