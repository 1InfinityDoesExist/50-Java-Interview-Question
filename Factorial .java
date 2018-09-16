
import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public int factorial(int number)
	{
		int[] dp = new int[number+1];
		dp[0] = 1;
		dp[1] = 1;
		for(int iter = 2; iter <= number ; iter++)
		{
			dp[iter] = dp[iter-1] * iter;
		}
		return dp[number];
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int number = input.nextInt();
			int ans = sol.factorial(number);
			System.out.println(ans);
		}
	}
}
