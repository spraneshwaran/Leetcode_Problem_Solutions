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
    public ListNode middleNode(ListNode head) {
        int n=0,p=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            n++;
        }
        while(p<n/2){
            head=head.next;
            p++;
        }
        return head;
    }
}