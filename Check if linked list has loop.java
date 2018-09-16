
import java.io.*;
import java.lang.*;
import java.util.*;

class LinkedList
{
	int data;
	LinkedList next;
	LinkedList(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class GFG
{
	public boolean loopDetection(LinkedList head)
	{
		LinkedList slow = head;
		LinkedList fast = head;

		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		LinkedList head = new LinkedList(2);
		head.next = new LinkedList(44);
		head.next.next = new LinkedList(4);
		head.next.next.next = new LinkedList(14);
		head.next.next.next.next = new LinkedList(24);

		boolean ans = sol.loopDetection(head);
		if(ans)
		{
			System.out.println("Yes It has Loop");
		}
		else
		{
			System.out.println("No It dont have any loop");
		}
	}
}
