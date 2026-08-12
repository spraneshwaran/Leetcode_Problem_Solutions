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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return li;
        inOrder(li,root);
        return li;
    }
    static void inOrder(List<Integer> li,TreeNode node){
        if(node==null) return ;
        inOrder(li,node.left);
        li.add(node.val);
        inOrder(li,node.right);
    }
}