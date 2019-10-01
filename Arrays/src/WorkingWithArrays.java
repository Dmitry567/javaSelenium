public class WorkingWithArrays
{
	public static void main(String[] args)
	{
		int[] myArray; int myArray2[];
		myArray = new int[66];
		myArray[0] = 24;
		
		 String myString2[];
		 String[] myString = new String[2];
		 myString[0] = new String("Tony");
		 myString[1] = "Vlad";
		 
		 for (int i = 0; i < myString.length; i++)
			 System.out.println(myString[i]);
		 
// array initialization
		 String[] family = { "mama", "papa" };
// for each
		for(String member: family)
			System.out.println(member);
	}
}
