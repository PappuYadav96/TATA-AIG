package TESTNGPractice;

public class Testp {

	public static void main(String[] args) {
		String s="I am from india";    

		String[] st=s.split(" ");

		for(int i=st.length-1; i>=0; i--)
		{
			System.out.print(st[i]+" ");
		}	
	}

}