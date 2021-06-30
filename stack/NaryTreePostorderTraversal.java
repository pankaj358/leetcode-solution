import java.util.List;
import java.util.ArrayList;

public class NaryTreePostorderTraversal
{

  List<Integer> list = new ArrayList<>();  

  List<Integer> postorder(Node root)
  {
    postorderNary(root);
    return list;
  }

  private void postorderNary(Node root)
  {
    if(root == null) return;
     
    for(Node node : root.children)
     postorderNary(node);

    list.add(root.val);
  }  

 
  class Node
  {
    int val;
    List<Node> children;
  }
}
