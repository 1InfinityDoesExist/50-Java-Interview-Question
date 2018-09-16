
import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{

	public char firstNonRepeatingCharacter(String str)
	{
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for(int iter = 0; iter < str.length(); iter++)
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
			if(m.getValue() == 1)
			{
				return m.getKey();
			}
		}
		return '1';
	}
	public static void main(String[] args)
	{
		GFG sol = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		input.nextLine();
		while(testCase-- > 0)
		{
			String str = input.next();
			char c = sol.firstNonRepeatingCharacter(str);
			System.out.println(c);
		}
	}
}
