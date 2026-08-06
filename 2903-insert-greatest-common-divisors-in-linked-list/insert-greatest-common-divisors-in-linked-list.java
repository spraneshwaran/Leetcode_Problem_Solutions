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
    public int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        List<Integer>list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        for(int i=0;i<list.size()-1;i+=2){
            list.add(i+1,gcd(list.get(i),list.get(i+1)));
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