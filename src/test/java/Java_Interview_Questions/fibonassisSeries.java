package Java_Interview_Questions;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class fibonassisSeries {

	@Test
	public static void fibonassis() {
	
		int N1=0;
		int N2=1;
		int N3;
		
		for(int i=0 ; i<10 ;i++) 
		
		{
			if(i==0)
			{
				System.out.println(i);
			}
			else if (i==1)
			{
				System.out.println(i);
			}
			else
			{
				N3= N1+N2;
				System.out.println(N3);
				//replace the N1&N2
				N1=N2;
				N2=N3;
			}
		}
	}
}
