package Java_Practices;

import java.util.ArrayList;

public class CoreJava2 {

	public static void main(String[] args) {

		//From Array Finding the Event Numbers
			int[] ar2 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
			
			System.out.println(ar2.length);
		//For Loop
		//If Else Condition
			
			for(int i=0;i<ar2.length;i++)
			{		
			if(ar2[i]%2==0)			
				{
				System.out.println("Even Number is: "+ ar2[i]);
				}
			else
			{
				System.out.println("Odd Number is: "+ ar2[i]);
			}
			
			}

			System.out.println("Printing from For Each/Enhanced for loop");
		//For Each Loop 
			for (int i : ar2)
				{
				System.out.println(ar2[i]);
				}
			
		//Array List with Data Type
			ArrayList<String> a= new ArrayList<String>();
				a.add("Sai");
				a.add("Kiran");
				a.add("Rao");
				a.add("Pavan");
				a.add("Shoban");
				a.add("Babu");
				a.add("Rajanikar");
				a.add("Naga");
				a.add("Raju");
				a.remove(2);
			System.out.println(a.get(2));
			System.out.println(a.size());
				
		//Array List without any Data Type
				ArrayList<Object> a1 = new ArrayList<>();
				a1.add("S1");
				a1.add(1);
				a1.add(1.23535467f);
				a1.add(1.214345);
				a1.add(true);
			System.out.println(a1);
			System.out.println(a1.size());
				
				
		}


	}
