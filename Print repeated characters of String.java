
import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public void repeatedCharacter(String str)
	{
		LinkedHashMap<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for(int iter = 0; iter < str.length() ;iter++)
		{
			char c = str.charAt(iter);
			Integer val = mp.get(c);
			if(val != null)
			{
				mp.put(c, val+1);
			}
			else
			{
				mp.put(c, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entry = mp.entrySet();
		for(Map.Entry<Character, Integer> m : entry)
		{
			if(m.getValue() > 1)
			{
				System.out.print(m.getKey() + " ");
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
			String str = input.next();
			sol.repeatedCharacter(str);
		}
	}
}
