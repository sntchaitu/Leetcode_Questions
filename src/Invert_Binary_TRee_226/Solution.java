package Invert_Binary_TRee_226;

import java.util.*;
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 

public class Solution {
	
	
	public TreeNode invertTree1(TreeNode root) {
        if(root==null)
        {
            return root;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode buffer = q.poll();
            TreeNode temp =  buffer.left;
            buffer.left = buffer.right;
            buffer.right = temp;
            if(buffer.left!=null)
            {
                q.offer(buffer.left);
            }
            if(buffer.right!=null)
            {
                q.offer(buffer.right);
            }
        }
        return root;
    }
	  public TreeNode invertTree3(TreeNode root) {
	        if(root==null)
	        {
	            return root;
	        }
	        Stack<TreeNode> q = new Stack<TreeNode>();
	        q.push(root);
	        while(!q.isEmpty())
	        {
	            TreeNode buffer = q.pop();
	            TreeNode temp =  buffer.left;
	            buffer.left = buffer.right;
	            buffer.right = temp;
	            if(buffer.left!=null)
	            {
	                q.push(buffer.left);
	            }
	            if(buffer.right!=null)
	            {
	                q.push(buffer.right);
	            }
	        }
	        return root;
	    }
	
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
            return root;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
