import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public boolean isPalindrome(String str)
	{
		int low = 0;
		int high = str.length()-1;
		while(low < high)
		{
			if(str.charAt(low) != str.charAt(high))
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
			String str = input.next();
			boolean ans = sol.isPalindrome(str);
			if(ans)
			{
				System.out.println("Yes " + str + " is a Palindrome");
			}
			else
			{
				System.out.println("No " + str + " is not a Palindrome");
			}
		}
	}
}
