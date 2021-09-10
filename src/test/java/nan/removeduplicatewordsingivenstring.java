package nan;

import java.util.LinkedHashSet;

public class removeduplicatewordsingivenstring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="india is my my country ";
		String str[]=s.split(" ");
				
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		for(String ss:set)
		{
			System.out.println(ss+" ");
		}
		}
}

