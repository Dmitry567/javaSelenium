
public class ArrayComparison
{
	public static void main(String[] args)
	{
       String[] books1 = {"War and Peace", "Farewell to Arms", "Hamlet"};
       String[] books2 = {"War and Peace", "Farewell to Arms", "Hamlet"};
       
       if(books1 == books2)
    	   System.out.println("==: Books are equal");
       
       if(Arrays.equals(books1, books2))
    	   System.out.println("equals: Books are equal");
	}
}
