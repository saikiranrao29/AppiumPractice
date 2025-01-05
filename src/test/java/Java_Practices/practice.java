package Java_Practices;

import java.util.Arrays;

import org.testng.annotations.Test;

public class practice {
	@Test
	public static void arrays() {
		
		
		int[] Num=new int[5];	
		Num[0]  = 9;
		Num[1] =  5;
		Num[2] =  5;
		Num[3] =  3;
		Num[4] =  5;

		
		for (int number :Num)
			
		{
			System.out.println(number);
		}
	}
	
	@Test
	public static void array() {
	
		int[] Numbers ={12,34,65,7567,12345};
		int[] Numbers1 ={12,34,65,7567,12345};
		//Numbers.equals(Numbers1);
		System.out.println(Arrays.equals(Numbers, Numbers1));
	}

}
