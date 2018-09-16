
import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public int findIndex(ArrayList<Integer> ai, final int k)
	{
		int low = 0;
		int high = ai.size()-1;
		while(low < high)
		{
			int mid = low + (high-low)/2;
			if(ai.get(mid) == k)
			{
				return mid;
			}
			else if(ai.get(mid) > k)
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		return -1;
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
			int k = input.nextInt();
			int index = sol.findIndex(ai, k);
			System.out.println(index);
		}
	}
}
