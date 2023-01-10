package JAVA_PROGRAM_PRACTICE;

public class findDuplicateElement {

	public static void main(String[] args) {
		
	
		String[]a= {"Java","C","C++","Java","C"};
		boolean flag=false;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; i<a.length; j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("print duplicate element:"+a[i]);
					flag=true;
				}
			}}
		
		if(flag==false)
		{
		System.out.println("Duplicate not found");
}}}