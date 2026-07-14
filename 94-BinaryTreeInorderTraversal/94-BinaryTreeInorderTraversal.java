// Last updated: 14/07/2026, 14:15:19
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
       
      List<Integer> list=new ArrayList<>();
      inorder(root,list);
      return list; }
      void inorder(TreeNode root,List<Integer> list) {
        if(root!=null) {
            inorder(root.left,list);
            list.add(root.val);
            inorder(root.right,list);
        }
    }
} 

                                                                                                                                                           
        