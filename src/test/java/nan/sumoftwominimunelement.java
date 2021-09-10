package nan;

public class sumoftwominimunelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {10,50,5,20,30};
int sum=0;
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a.length;j++)
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
for(int i=0;i<2;i++)
{
	sum=sum+a[i];
	if(a[i]==a[1])
	{
		System.out.println(a[i]);
	}
	
}
System.out.println(sum);
	}

}
