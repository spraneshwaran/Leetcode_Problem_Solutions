/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> li=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        postOrder(li,root);
        return li;
    }
    void postOrder(List<Integer> li,TreeNode node){
        if(node==null) return;
        postOrder(li,node.left);
        postOrder(li,node.right);
        li.add(node.val);
    }
}