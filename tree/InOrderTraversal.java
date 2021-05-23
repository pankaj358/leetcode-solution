
import java.util.List;
import java.util.ArrayList;

public class InOrderTraversal{

  private List<Integer> list = new ArrayList<>();


  public List<Integer> inorder(TreeNode root)
  {
     traverse(root);
     return list;
  }

  private void traverse(TreeNode root)
  {
     if(root == null)
      return;

     traverse(root.left);
     list.add(root.val);
     traverse(root.right);
  }

}
