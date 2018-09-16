import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public boolean isPalindrome(int number)
	{
		ArrayList<Integer> ai = new ArrayList<Integer>();
		while(number > 0)
		{
			ai.add(number%10);
			number /= 10;
		}

		int low = 0;
		int high = ai.size()-1;
		while(low < high)
		{
			if(ai.get(low) != ai.get(high))
			{
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int number = input.nextInt();
			boolean ans = sol.isPalindrome(number);
			if(ans)
			{
				System.out.println("Yes " + number + " is a Palindrome");
			}
			else
			{
				System.out.println("No " + number + " is not a Palindrome");
			}
		}
	}
}
