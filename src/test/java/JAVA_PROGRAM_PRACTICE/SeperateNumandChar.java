package JAVA_PROGRAM_PRACTICE;

public class SeperateNumandChar {

	public static void main(String[] args) {

		String s ="655Pap55pu78";
		String alpha=" ";
		String num=" ";

		for(int i=0; i<s.length(); i++) {

			if(s.charAt(i)>='A'&& s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				alpha= alpha+s.charAt(i);

			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
				num=num+s.charAt(i);
		}		
		System.out.println(alpha+num);
	}

}
