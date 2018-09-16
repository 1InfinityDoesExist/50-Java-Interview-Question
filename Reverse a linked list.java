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
	public LinkedList reverseList(LinkedList head)
	{
		LinkedList prev = null;
		LinkedList current = head;
		LinkedList next;
		while(current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		LinkedList head = new LinkedList(2);
		head.next = new LinkedList(4);
		head.next.next = new LinkedList(4);
		head.next.next.next = new LinkedList(14);
		head.next.next.next.next = new LinkedList(24);
		LinkedList ptr = sol.reverseList(head);
		while(ptr != null)
		{
			System.out.print(ptr.data + " ");
			ptr = ptr.next;
		}
	}
}
