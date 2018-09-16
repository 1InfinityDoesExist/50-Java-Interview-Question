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
	public int middleElementLinkedList(LinkedList head)
	{
		int len = 0;
		LinkedList ptr = head;
		while(ptr != null)
		{
			len++;
			ptr = ptr.next;
		}
		ptr = head;
		for(int iter = 1; iter <= len/2; iter++)
		{
			ptr = ptr.next;
		}
		return ptr.data;
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		LinkedList head = new LinkedList(2);
		head.next = new LinkedList(44);
		head.next.next = new LinkedList(4);
		head.next.next.next = new LinkedList(14);
		head.next.next.next.next = new LinkedList(24);

		int length = sol.middleElementLinkedList(head);
		System.out.println(length);
	}
}
