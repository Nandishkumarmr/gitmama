package nan;



import java.util.LinkedHashSet;

public class onlyduplicateswords {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="india is my my country ";
		String str[]=s.split(" ");
				
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}

for(String ss:str)
{
	int count=0;
	for(int i=0;i<str.length;i++)
	{
		
		if(ss.equals(str[i]))
		{
			count++;
		}
		
	}
	//System.out.println("word: "+ss+" count: "+ count);
	if(count>1)
	{
		System.out.println("duplicates word: "+ss);
	}
}

	}
}