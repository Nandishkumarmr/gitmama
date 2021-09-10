package nan;

public class withoutusinglengthmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="India";
String s1="";
String rev=" ";
char[] a=s.toCharArray();
int count=0;
for(char ch:a)
{
	count++;
}
for(int i=count-1;i>=0;i--)
{
rev=rev+s.charAt(i);
}
System.out.println(rev);
	}

}
