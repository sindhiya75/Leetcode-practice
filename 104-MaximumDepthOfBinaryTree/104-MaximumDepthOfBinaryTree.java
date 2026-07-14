// Last updated: 14/07/2026, 14:15:16
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
        int leftroot=maxDepth(root.left);
        int rightroot=maxDepth(root.right);
        return Math.max(leftroot,rightroot)+1;
        
    }
}