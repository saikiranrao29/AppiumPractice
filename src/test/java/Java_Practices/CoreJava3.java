package Java_Practices;

public class CoreJava3 {

	public static void main(String[] args) {
		//Strings
		
		//Strings are Object
		//i) String Literal 
		//ii) by New Operator
		
		
		//==> String Literal
		String s1= "1.Sai Kiran Rao Duggyala";
		String s2= "2.I am working as Mobile Automation Test Engineer";
		
		System.out.println(s1);
		System.out.println(s2);
		
		//==> String by New Operator 
		String s3= new String("3.I Stay in Hyderabad");
		String s4= new String("4.I am Single");
		System.out.println(s3);
		System.out.println(s4);
		
		//String Methods
		String T1="     My Latop Brand is Honor & It is having 16 GB Ram in it & It is working fine from the last two years & this is my company Laptop & is easy to handle ";
		System.out.println("Total Count of Characters is" + T1.length());
		
		// To Split
		String[] Split= T1.split("&");
		System.out.println(Split.length);
		
		for (int i=0; i<Split.length;i++)
		{
			System.out.println(Split[i]);
		}
		
		//To Print all characters in the String
		for (int i=0; i<T1.length();i++)
		{
			System.out.println("S.No-"+(i+1)+" ----> "+  T1.charAt(i));
		}
		
		//Trim(method is used to trim the spaces in the beginning and end of a string)
		String trim=T1.trim();
		System.out.println(trim);
		
		//To Trim the All the Spaces from the String() by Using Replaceall() Method
		String without=T1.replaceAll(" ", "");
		System.out.println(without);
		
		//To Print all characters in the String in Reverse Order	
		for (int i=T1.length()-1; i>=0; i--)
		{
			System.out.print(T1.charAt(i));
		}
	}
	
}

