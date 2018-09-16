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
	public LinkedList loopFirstEement(LinkedList head)
	{
		LinkedList slow = head;
		LinkedList fast = head;
		boolean mila = false;
		while(fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
			{
				mila = true;
				break;
			}
		}

		if(mila != true)
		{
			return null;
		}
		slow = head;
		while(slow != fast)
		{
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		LinkedList head = new LinkedList(2);
		head.next = new LinkedList(44);
		head.next.next = new LinkedList(4);
		head.next.next.next = new LinkedList(14);
		head.next.next.next.next = new LinkedList(24);

		LinkedList ans = sol.loopFirstEement(head);
		if(ans == null)
		{
			System.out.println("Nahi hey");
		}
		else
		{
			System.out.println(ans.data);
		}

	}
}
