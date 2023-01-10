package JAVA_PROGRAM_PRACTICE;

public class reversesentence1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="We are going to market";
		String[]st=s.split("");
		
		for(int i=st.length-1; i>=0; i--)
		{
			System.out.print(st[i]+" ");
		}
		
	}

}
