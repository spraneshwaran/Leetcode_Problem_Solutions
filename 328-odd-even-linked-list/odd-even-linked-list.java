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
    public ListNode oddEvenList(ListNode head) {
        ListNode curr=head;
        int n=0;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        curr=head;
        int ind=0;
        int rp[]=new int[n];
        while(curr!=null){
            rp[ind++]=curr.val;
            curr=curr.next;
        }
        int a[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(i % 2==0) a[j++]=rp[i];
        }
        for(int i=0;i<n;i++){
            if(i % 2!=0) a[j++]=rp[i];
        }
        ListNode temp=new ListNode(0);
        curr=temp;
        for(int i:a){
            ListNode newNode=new ListNode(i);
            curr.next=newNode;
            curr=curr.next;
        }
        return temp.next;

    }
}