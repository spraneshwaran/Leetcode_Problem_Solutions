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
    TreeNode search(TreeNode node,int val){
        if(node==null || node.val==val) return node;
        return (val<node.val) ? search(node.left,val) : search(node.right,val);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root,val);
    }
}