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
    public void reorderList(ListNode head) {
        List<Integer> li=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            li.add(curr.val);
            curr=curr.next;
        }
        for(int i=1;i<li.size();i+=2){
            li.add(i,li.removeLast());
        }
        curr=head;
        for(int i:li){
            curr.val=i;
            curr=curr.next;
        }
    }
}