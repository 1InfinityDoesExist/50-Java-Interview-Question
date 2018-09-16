import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public String reverse(String str)
	{
		StringBuffer br = new StringBuffer(str);
		br.reverse();
		return br.toString();
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			String str = input.next();
			String reverseString = sol.reverse(str);
			System.out.println(reverseString);
		}
	}
}
