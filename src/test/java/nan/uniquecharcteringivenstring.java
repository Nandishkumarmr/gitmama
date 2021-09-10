package nan;

import java.util.HashSet;

public class uniquecharcteringivenstring {
public static void main(String[] args) {
	String s="india";
	HashSet<Character> set=new HashSet<Character>();
	for(int i=0;i<s.length();i++)
	{
		set.add(s.charAt(i));
	}
	for(char ch:set)
	{
		int count=0;
		for(int i=0;i<s.length();i++) {
	if(ch==s.charAt(i))
	{
		count++;
		
	}
	 
		
}if(count==1) {
	System.out.println(count+"   "+ch);
}
	}
	}
	}
