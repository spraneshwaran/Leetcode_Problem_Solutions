/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int p=1;
        if(head==null || head.next==null){
            return head;
        }
        ListNode rp=head;
        int c=1;
        while(rp.next!=null){
            c++;
            rp=rp.next;
        }
        k%=c;
        while(p<=k){
            ListNode curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            ListNode temp=curr.next;
            curr.next=null;
            temp.next=head;
            head=temp;
            p++;
        }
        return head;
    }
}