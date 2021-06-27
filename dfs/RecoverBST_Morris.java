public class RecoverBST_Morris{

  public void recover(TreeNode root){
   
    TreeNode prev = null;
    TreeNode first = null;
    TreeNode second = null;

    while(root != null){
       
      if(root.left == null){
       
        if(prev != null && prev.val > root.val){
           if(first == null) first = prev;
           second = root;
        }

        prev = root;
        root = root.right;
      } 
      else
      {
         TreeNode tmp = root.left;
         while(tmp.right != null && tmp.right != root) tmp = tmp.right;

         if(tmp.right == null){
            tmp.right = root;
            root = root.left;
         }
         else {
            tmp.right = null;
            if(prev != null && prev.val > root.val){
                if(first == null) first = prev;
                second = root;
             }
             prev = root;
             root = root.right;
         }
      } 
       
    }

    int t = first.val;
    first.val = second.val;
    second.val = t;

  }


  class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
  }

}
