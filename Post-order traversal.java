
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
	public void postOrder(TreeNode root)
	{
		Stack<TreeNode> st = new Stack<TreeNode>();
		Stack<TreeNode> output = new Stack<TreeNode>();
		st.push(root);
		while(!st.isEmpty())
		{
			TreeNode node = st.peek();
			st.pop();
			output.push(node);
			if(node.left != null)
			{
				st.push(node.left);
			}
			if(node.right != null)
			{
				st.push(node.right);
			}
		}
		while(!output.isEmpty())
		{
			System.out.print(output.peek().data + " ");
			output.pop();
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
		sol.postOrder(root);
	}
}
