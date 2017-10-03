/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p=l1, q=l2, result=head;
        int carry = 0;
        while(p!=null || q!=null){
        	int x =0, y=0;
        	if (p!=null) {
        		x=p.val;
        	}
        	if (q!=null) {
        		y=q.val;
        	}
        	int sum = carry+x+y;
        	carry = sum / 10;
        	result.next=new ListNode(sum%10);
        	result=result.next;
        	if (p!=null) {
        		p=p.next;
        	}
        	if(q!=null){
        		q=q.next;
        	}
        }
        if (carry>0){
        	result.next = new ListNode(carry);
        }
        return head.next;

    }


}