package Academy.TyrooTest;

import java.util.HashMap;
import java.util.Set;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "keep";
		String s2 = "peek";
		boolean isAnagram = true;
		if(s1.length()!=s2.length())
		{
			isAnagram = false;
		}
		else
		{
		HashMap<Character, Integer> hp = new HashMap<Character, Integer>();
		for(int i=0;i<s1.length();i++)
		{
			char c = s1.charAt(i);
			if(hp.containsKey(c))
			{
				hp.put(c, hp.get(c)+1);
			}
			else
			{
				hp.put(c, 1);
			}
		}
		
		for(int i=0;i<s2.length();i++)
		{
			char c = s2.charAt(i);
			if(hp.containsKey(c))
			{
				hp.put(c, hp.get(c)-1);
			}
			
		}
		Set<Character> set= hp.keySet();
		for(char c:set)
		{
			if(hp.get(c)!=0)
			{
				isAnagram = false;
			}
		}
		

	}

		if(isAnagram)
		{
			System.out.println("string is anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
