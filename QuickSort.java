import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public int partition(ArrayList<Integer> ai, int low, int high)
	{
		int pivot = ai.get(high);
		int iter = low-1;
		for(int jter = low; jter < high; jter++)
		{
			if(ai.get(jter) <= pivot)
			{
				iter++;
				int temp = ai.get(iter);
				ai.set(iter, ai.get(jter));
				ai.set(jter, temp);
			}
		}
		int temp = ai.get(iter+1);
		ai.set(iter+1, ai.get(high));
		ai.set(high, temp);
		return iter+1;
	}
	public void quick(ArrayList<Integer> ai, int low, int high)
	{
		if(low < high)
		{
			int pi = partition(ai, low, high);
			quick(ai, low, pi-1);
			quick(ai, pi+1, high);
		}
		return;
	}
	public void quickSorting(ArrayList<Integer> ai)
	{
		int low = 0;
		int high = ai.size()-1;
		quick(ai, low, high);
		return;
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		input.nextLine();
		while(testCase-- > 0)
		{
			int n = input.nextInt();
			ArrayList<Integer> ai = new ArrayList<Integer>();
			for(int iter = 0; iter < n; iter++)
			{
				ai.add(input.nextInt());
			}
			sol.quickSorting(ai);
			Iterator iter = ai.iterator();
			while(iter.hasNext())
			{
				System.out.print(iter.next() + " ");
			}
		}
	}
}
