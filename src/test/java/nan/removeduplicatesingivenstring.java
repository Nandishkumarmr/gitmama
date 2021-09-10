package nan;

import java.util.HashSet;

public class removeduplicatesingivenstring {
public static void main(String[] args) {
	String s="india";
	HashSet<Character> set=new HashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(char ch:set)
	{
		

		System.out.println(ch);
		
}

	}
	
	}
	
