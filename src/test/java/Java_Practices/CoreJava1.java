package Java_Practices;

public class CoreJava1 {

	public static void main(String[] args) {

		System.out.println("Welcome to Appium");
	//Data Types:-
	//Variables
	//Initializations
	//Declarations
	//Print them
		int Num =5;
		System.out.println("The Value of Above Given Number is "+Num);
		
		String name="Sai Kiran Rao";
		System.out.println(name);
		
		char ch= 'S';
		System.out.println(ch);
		
		double d= 1.213456; 
		System.out.println(d);
		
		float f=13456.65765f;
		System.out.println(f);
		
	//Arrays Type-1 : New Operator object, Give the Size Initially Then Declare the Values to it.  
		int[] ar = new int[7];
		ar[0]=55;
		ar[1]=66;
		ar[2]=77;
		ar[3]=88;
		ar[4]=99;
	//For Loop	
		for (int i=0; i<5; i++) 
		{
			System.out.println(ar[i]);
		}
		
	//Arrays -Type-2 : No Size,No Object &  Direct Values  	
		int[] ar2 = {22,34,56,45,78,89,10325,4354356,4364,54645,46574,123};
		System.out.println(ar2.length);

		for (int i2=0; i2<ar2.length; i2++)
		{
			System.out.println(ar2[i2]);
		}
		
		String[] names = {"Sai Kiran Rao","Rajanikar","Pavan Jaidav","Shoban Babu","Sahrud Reddy"};
		System.out.println("Total Number of People Present in the Room is: " + names.length);
		
		for(int i=0;i<names.length; i++)
			
		{
			System.out.println(names[i]);
		}
		
		}

	}
