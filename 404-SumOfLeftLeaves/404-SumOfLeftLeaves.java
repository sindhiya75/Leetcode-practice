// Last updated: 14/07/2026, 14:14:24
class TreeNode{
    TreeNode left;
    TreeNode right;
    int value;
    
    TreeNode(int value){
        this.value=value;
    }
}
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        int sum=0;

        if(root.left!=null && root.left.left==null && root.left.right==null){
            sum+=root.left.value;
        }
        else{
            sum+=sumOfLeftLeaves(root.left);
        }
        sum+=sumOfLeftLeaves(root.right);
        return sum;

        
    }
}