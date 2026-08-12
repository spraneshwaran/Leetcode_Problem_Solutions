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
    List<Integer>li =new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)return li;
        preOrder(li,root);
        return li;
    }
    static void preOrder(List<Integer> li,TreeNode node){
        if(node==null)return;
        li.add(node.val);
        preOrder(li,node.left);
        preOrder(li,node.right);
    }
}