import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int number = input.nextInt();
			Set<Integer> ai = new LinkedHashSet<Integer>();
			for(int iter = 0; iter < number; iter++)
			{
				ai.add(input.nextInt());
			}
			Iterator iter = ai.iterator();
			while(iter.hasNext())
			{
				System.out.print(iter.next() + " ");
			}
		}
	}
}
