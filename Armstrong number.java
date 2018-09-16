import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public boolean isArmstrongNumber(int number)
	{
		int num_copy = number;
		int sum = 0;
		while(number > 0)
		{
			int rem = number%10;
			sum = sum + (rem*rem*rem);
			number /= 10;
		}
		if(num_copy == sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int number = input.nextInt();
			boolean ans = sol.isArmstrongNumber(number);
			if(ans)
			{
				System.out.println("Yes " + number + " is a Armstrong number");
			}
			else
			{
				System.out.println("No " + number + " is not a Armstrong number");
			}
		}
	}
}
