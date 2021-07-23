import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class CloneGraph
{
  
  Map<Integer, Node> map = new HashMap<>();

  public Node cloneGraph(Node node)
  {
    if(node == null) return null;

    if(map.containsKey(node.val)) return map.get(node.val);
   
    Node clone = new Node(node.val);
    map.put(clone.val, clone);
    
    for(Node n: node.neibhors)
    {
      clone.neibhors.add(cloneGraph(n));
    }

    return clone;
  }

  class Node
  {
    int val;
    List<Node> neibhors;
  
    Node(int val)
    {
      this.val = val;
      neibhors = new ArrayList<>();
    }
  }
}
