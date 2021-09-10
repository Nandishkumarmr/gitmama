package nan;

public class secondmaximumlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1000,80,500,60};
for(int i=0; i<a.length;i++)
{
	for(int j=0; j<a.length; j++)
	{
		if(a[i]>a[j])
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
System.out.println(a[1]);
	}

} 