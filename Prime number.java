import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public void primeGenerator(int n)
	{
		int[] dp = new int[n+1];
		for(int iter = 0; iter <= n; iter++)
		{
			dp[iter] = 0;
		}
		for(int iter = 2; iter*iter <= n; iter++)
		{
			if(dp[iter] == 0)
			{
				for(int jter = 2*iter ; jter <= n; jter = jter+iter)
				{
					dp[jter] = 1;
				}
			}
		}
		for(int iter = 2; iter <= n; iter++)
		{
			if(dp[iter] == 0)
			{
				System.out.print(iter + " ");
			}
		}
		return;
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int n = input.nextInt();
			sol.primeGenerator(n);
		}
	}
}
