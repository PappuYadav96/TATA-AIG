package JAVA_PROGRAM_PRACTICE;

public class ReverseSentence {

	public static void main(String[] args) {
	
		String st="I Love Patna";
		
		String[]s =st.split("P");
		
		for(int i=0; i<s.length; i++)
		{
			
			System.out.print(s[i]);
		}
			
	}

}
