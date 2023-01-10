package JAVA_PROGRAM_PRACTICE;

import java.lang.reflect.Array;
import java.util.Arrays;

public class secondlargest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,94, 54, 98, 98, 6, 86, 4}	;
		
		Arrays.sort(arr);
		System.out.println("Second largest element=" +arr[arr.length-2]);
	}

}
