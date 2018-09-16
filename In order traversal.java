import java.io.*;
import java.lang.*;
import java.util.*;

class TreeNode
{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
public class GFG
{
	public void preOrder(TreeNode root)
	{
		Stack<TreeNode> st = new Stack<TreeNode>();
		TreeNode ptr = root;
		while(!st.isEmpty() || ptr != null)
		{
			if(ptr != null)
			{
				st.push(ptr);
				ptr = ptr.left;
			}
			else
			{
				TreeNode temp = st.peek();
				st.pop();
				System.out.println(temp.data);
				ptr = temp.right;
			}
		}
		return;
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		TreeNode root = new TreeNode(20);
		root.left = new TreeNode(18);
		root.right = new TreeNode(28);
		root.left.left = new TreeNode(16);
		root.left.right = new TreeNode(19);
		root.right.left = new TreeNode(24);
		root.right.right = new TreeNode(30);
		sol.preOrder(root);
	}
}
