import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public int findFibo(final int n)
	{
		int[] fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;

		for(int iter = 2; iter <= n; iter++)
		{
			fib[iter] = fib[iter-1] + fib[iter-2];
		}
		return fib[n];
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int n = input.nextInt();
			int ans = sol.findFibo(n);
			System.out.println(ans);
		}
	}
}
