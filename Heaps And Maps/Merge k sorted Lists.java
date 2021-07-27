Merge k sorted linked lists and return it as one sorted list.

Example :

1 -> 10 -> 20
4 -> 11 -> 13
3 -> 8 -> 9
will result in

1 -> 3 -> 4 -> 8 -> 9 -> 10 -> 11 -> 13 -> 20



/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeKLists(ArrayList<ListNode> a) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	    for(ListNode x : a){
	        while(x != null){
	            minHeap.add(x.val);
	            x = x.next;
	        }
	    }
	    ListNode result = new ListNode(-1);//dummy
	    ListNode res = result;
	    while(!minHeap.isEmpty()){
	        result.next = new ListNode(minHeap.remove());
	        result = result.next;
	    }
	    return res.next;
	}
}
