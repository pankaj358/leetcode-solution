
import java.util.List;
import java.util.ArrayList;

public class InOrderTraversal{

  public List<Integer> inorderTraversal(TreeNode root){

   List<Integer> list = new ArrayList<>();
   inorder(root, list);  
   return list;
  }

  public void inorder(TreeNode root, List<Integer> list){
    if(root == null) return ;
  
    inorder(root.left, list);
    list.add(root.val);
    inorder(root.right, list);
  }
 
  private class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
  }
}
