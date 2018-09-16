
import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public int reverseNumber(int number)
	{
		int rev_number = 0;
		while(number > 0)
		{
			int rem = number %10;
			rev_number = rev_number * 10 + rem;
			number /= 10;
		}
		return rev_number;
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		input.nextLine();
		while(testCase-- > 0)
		{
			int number = input.nextInt();
			int revNumber = sol.reverseNumber(number);
			System.out.println(revNumber);
		}
	}
}
