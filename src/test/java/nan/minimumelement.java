package nan;

public class minimumelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {100,20,300,40};
for(int i=0; i<a.length;i++)
{
	for(int j=0; j<a.length; j++)
	{
		if(a[i]<a[j])
		{
			
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}

for(int i=0; i<a.length;i++)
{
	System.out.println(a[i]);
	
}
System.out.println(a[0]);
System.out.println(a[a.length-1]);
	}

}
