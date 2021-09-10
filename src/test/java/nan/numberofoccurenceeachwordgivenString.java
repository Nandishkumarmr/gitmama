package nan;


 
import java.util.LinkedHashSet;

public class numberofoccurenceeachwordgivenString {
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
	int count=0;
	for(int i=0;i<str.length;i++)
	{
		
		if(ss.equals(str[i]))
		{
			count++;
		}
		
	}
	

		System.out.println( ss+" " +count);
	
}

	}
}