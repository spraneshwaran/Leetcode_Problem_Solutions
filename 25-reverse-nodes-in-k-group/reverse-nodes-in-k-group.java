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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        for(int i=0;i<=list.size()-k;i+=k){
            int ind=i;
            int j=i+k-1;
            while(ind<j){
                int temp=list.get(ind);
                list.set(ind,list.get(j));
                list.set(j,temp);
                ind++;
                j--;
            }
        }
        ListNode temp=new ListNode(0);
        ListNode curr=temp;
        for(int i:list){
            curr.next=new ListNode(i);
            curr=curr.next;
        }
        return temp.next;
    }
}