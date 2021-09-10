package nan;

public class leastlengthingivenstringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String []a= {"nan","badman","sadman","gods"};
int count=0;
	String max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(max.length()>a[i].length())
		{
			count++;
			max=a[i];
		}
	}
	System.out.println(max);
	}

}
