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
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr=head;
        int n=0;
        while(curr!=null){
            n++;
            curr=curr.next;
        }
        int a[]=new int[n];
        curr=head;
        int ind=0;
        while(curr!=null){
            a[ind++]=curr.val;
            curr=curr.next;
        }
        for(int i=0;i<a.length;i++){
            int max=a[i];
            for(int j=i+1;j<a.length;j++){
                if(a[j]>max){
                    max=a[j];
                    break;
                }
            }
            if(max==a[i]) a[i]=0;
            else a[i]=max;
        }
        return a;
    }
}