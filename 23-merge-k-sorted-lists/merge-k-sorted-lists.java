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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list=new ArrayList<>();
        for(ListNode head:lists){
            while(head!=null){
                list.add(head.val);
                head=head.next;
            }
        }
        Collections.sort(list);
        ListNode head=new ListNode(0);
        ListNode temp=head;
        for(int i:list){
            temp.next=new ListNode(i);
            temp=temp.next;
        }
        return head.next;
    }
}