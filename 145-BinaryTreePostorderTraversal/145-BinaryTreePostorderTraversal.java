// Last updated: 14/07/2026, 14:15:02

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> list=new ArrayList<>();
      postorder(root,list);
      return list; }
      void postorder(TreeNode root,List<Integer> list) {
        if(root!=null) {
            postorder(root.left,list);
            postorder(root.right,list);
            list.add(root.val);
        } 

    }
}
