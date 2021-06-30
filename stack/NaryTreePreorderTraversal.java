import java.util.List;
import java.util.ArrayList;

public class NaryTreePreorderTraversal
{

  List<Integer> list = new ArrayList<>();  

  List<Integer> preorder(Node root)
  {
    preorderNary(root);
    return list;
  }

  private void preorderNary(Node root)
  {
    if(root == null) return;
     
    list.add(root.val);
    
    for(Node node : root.children)
     preorderNary(node);
  }  

 
  class Node
  {
    int val;
    List<Node> children;
  }
}
