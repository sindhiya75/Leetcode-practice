// Last updated: 14/07/2026, 14:15:03
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> list=new ArrayList<>();
      preorder(root,list);
      return list; }
      void preorder(TreeNode root,List<Integer> list) {
        if(root!=null) {
            list.add(root.val);
            preorder(root.left,list);
            preorder(root.right,list);
        } 
        
    }
}