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
        List<Integer> a=new ArrayList<>();
        while(head!=null){
            a.add(head.val);
            head=head.next;
        }
        for(int i=0;i<a.size();i++){
            int max=a.get(i);
            for(int j=i+1;j<a.size();j++){
                if(a.get(j)>max){
                    max=a.get(j);
                    break;
                }
            }
            if(max==a.get(i)) a.set(i,0);
            else a.set(i,max);
        }
        return a.stream().mapToInt(Integer::intValue).toArray();
    }
}