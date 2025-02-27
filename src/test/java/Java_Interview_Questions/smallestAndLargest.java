package Java_Interview_Questions;

import org.testng.annotations.Test;
import java.util.Arrays;

import org.testng.annotations.Test;

public class smallestAndLargest {
	@Test
	public static void smallAndLarg() {
		
		
		int[] numbers = {23,56,4,7,10,75,18,2,45,12,180,60,57};
		
	
		int start=numbers[0];
		
			for(int i=0;i<numbers.length;i++)
			{

				if(numbers[i] <=start ) {
					
					start= numbers[i]; 
				}
				else
				{
					
				}
			}
				
			System.out.println("Smallest Number is: "+ start);
			
			
			for(int i=0;i<numbers.length;i++)
			{

				if(numbers[i] >=start ) {
					
					start= numbers[i]; 
				}
				else
				{
					
				}
			}
				
			System.out.println("Greatest Number is: "+ start);
	}

	
	@Test
	public void smallest() {
		
		int[] numbers = {23,56,4,7,10,75,18,2,45,12,180,60,57};
		
		int small= Arrays.stream(numbers).min().orElseThrow();
		
		System.out.println(small);
	}
	//--------------------------------------------------//
	
	@Test
	public void largest() {
		
		int[] numbers = {23,56,4,7,10,75,18,2,45,12,180,60,57};
		
		int largest= Arrays.stream(numbers).max().orElseThrow();
		
		System.out.println(largest);
	}
	
	
	
	
}
