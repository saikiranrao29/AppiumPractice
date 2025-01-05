package Java_Practices;

public class CoreJava4{

		public static void main(String[] args) {
			
			//Main Methods
			
					//Other Calling in Main Method by creating the object for that class to access the methods in it 
				CoreJava4 P=new CoreJava4();
					P.Panterra1();
					Pandora2();
					
					DataType1();
					//Print all syso along with return
					String s= DataType2();
					System.out.println(s);
					
					//print only syso
					DataType2();
					
					//To Access From Another Class Creating the Object for that Class
					CoreJava5 Class2 =new CoreJava5();
					Class2.Test2();
				}
				//If it is Static method- We don't have to create the object to access the methods present in it  
				//If it is Non-Static Method - We need to Create the Object  to access the methods present in it 
				public void Panterra1()
				{
					System.out.println("Testing from Paterra1");
				}
				
				public static void Pandora2()
				{
					System.out.println("Testing from Pandora2");
				}
				
				//Data Type of the Methods:-
				//If it is Void so that method won't return anything 
				//If it is any other Data Type Ex:- String/Int then that method will return only that data type & It should have return key word here
				
				public static void DataType1()
				{
					System.out.println("Printing from DataType1");
				}
				public static String  DataType2()
				{
					System.out.println("Printing from DataType2");
					//return "Pavan";
					String s1="Pavan";
					return s1;

		}

	}

