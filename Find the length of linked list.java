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
	public int lengthOfLinkedList(LinkedList head)
	{
		int len = 0;
		while(head != null)
		{
			len++;
			head = head.next;
		}
		return len;
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		LinkedList head = new LinkedList(2);
		head.next = new LinkedList(4);
		head.next.next = new LinkedList(4);
		head.next.next.next = new LinkedList(14);
		head.next.next.next.next = new LinkedList(24);

		int length = sol.lengthOfLinkedList(head);
		System.out.println(length);
	}
}
