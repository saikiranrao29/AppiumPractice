package Java_Interview_Questions;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class reverseString {

	@Test
	public static void reverse1() {
	
		//-----------------------------------------//
		
		String name = "DUGGYALA SAIKIRAN RAO";
		String reverse= "";
		String reverse1= "";
		
		for(int i= name.length()-1; i>0; i--)
		{
			reverse += name.charAt(i);
			reverse1.concat(reverse);
		}
		
		System.out.println(reverse);
	}
	
	
	@Test
	public static void reverse2() {


		String name= "SAI KIRAN RAO";

		String reverse=" ";

			for (int i=name.length()-1; i>=0; i--)
			{
				
				reverse += name.charAt(i);
			}
		System.out.println(reverse);
			
			StringBuilder builder = new StringBuilder("honor laptop");
					System.out.println(builder.reverse().toString());
	
		}
	

			
			
}
	

