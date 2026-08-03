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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr=head;
        int n=0;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        curr=head;
        int a[]=new int[n];
        int i=0;
        while(curr!=null){
            a[i++]=curr.val;
            curr=curr.next;
        }
        int t=a[k-1];
        a[k-1]=a[n-k];
        a[n-k]=t;
        i=0;
        ListNode temp=new ListNode(0);
        curr=temp;
        for(int j=0;j<n;j++){
            ListNode newNode=new ListNode(a[j]);
            if(curr==null){
                curr=newNode;
            }
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newNode;
        }
        return temp.next;
    }
}