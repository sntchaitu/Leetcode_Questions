package sum_of_left_values_404;
import java.util.*;
 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }

public class Solution {
    int sum1 = 0;
    
    public int sumOfLeftLeaves1(TreeNode root) {
        
        if(root==null)
        {
            return 0;
        }
        int sum = 0;
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        s1.push(root);
        while(!s1.isEmpty())
        {
            TreeNode temp = s1.pop();
            if(temp.left!=null)
            {
                if(temp.left.left==null && temp.left.right==null)
                {
                    sum  = sum+temp.left.val;
                }
                else
                {
                    s1.push(temp.left);
                }
            }
             if(temp.right!=null)
            {
                if(temp.right.left!=null || temp.right.right!=null)
                {
                    s1.push(temp.right);
                }
            }
        }
        return sum;
    }
    
    
    public int sumOfLeftLeaves(TreeNode root) {
        sum(root,false);
        return sum1;
    }
    public void sum(TreeNode root,boolean isLeft) {
        
        if(root==null)
        {
            return;
        }
        sum(root.left,true);
        if(isLeft==true && root.left==null && root.right==null)
        {
            sum1+=root.val;
        }
        sum(root.right,false);
    }
    
    
}