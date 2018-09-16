
import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public void reverseWordOfString(String str)
	{
		Stack<String> st = new Stack<String>();
		String s = "";
		for(int iter = 0; iter < str.length(); iter++)
		{
			if(str.charAt(iter) == ' ')
			{
				if(s.length() == 0)
				{
					continue;
				}
				else
				{
					StringBuilder sbr = new StringBuilder(s);
					sbr.reverse();
					st.push(sbr.toString());
					s = "";
				}
			}
			else
			{
				s = s + str.charAt(iter);
				if(iter == str.length()-1)
				{
					StringBuilder sbb = new StringBuilder(s);
					sbb.reverse();
					st.push(sbb.toString());
				}
			}
		}
		str = "";
		while(!st.isEmpty())
		{
			if(st.size() == 1)
			{
				str = st.peek();
				System.out.print(str);
				st.pop();
				return;
			}
			str = st.peek();
			st.pop();
			System.out.print(str + " ");
		}
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		input.nextLine();
		while(testCase-- > 0)
		{

			String str = input.nextLine();
			sol.reverseWordOfString(str);
		}
	}
}
