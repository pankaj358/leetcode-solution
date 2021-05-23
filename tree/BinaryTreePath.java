
import java.util.List;
import java.util.ArrayList;

public class BinaryTreePath
{

  public List<String> binaryTreePath(TreeNode root)
  {
     List<String> ans = new ArrayList<>();
     helper(root, ans, "");
     return ans;
  }

  private void helper(TreeNode root, List<String> ans, String text)
  {
     if(root == null) return;

     if(root != null && root.left == null && root.right == null)
     {
        if(text.trim().length() == 0)
        {
          text +=root.val;
        }
        else
        {
          text += "->" + root.val;
        }
        ans.add(text);
        text = "";
        return;
     }

     if(text.trim().length() == 0 )
     {
       text +=root.val;
     }
     else
     {
        text += "->" + root.val;
     }

     helper(root.left, ans, text);
     helper(root.right, ans, text);
  }

}
