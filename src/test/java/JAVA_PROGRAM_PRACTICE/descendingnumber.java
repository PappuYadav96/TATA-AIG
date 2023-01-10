package JAVA_PROGRAM_PRACTICE;

public class descendingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[]= {1,2,5,8,2,9,4,3};
		for(int i=0; i<a.length; i++)
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
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]+" ");	

	}

}
