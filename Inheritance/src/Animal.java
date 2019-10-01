
public class Animal
{
	private String type;
	
// constructor this is method
	public Animal(String  aType)
	{
		type = aType;
	}
	
	public Animal()
	{
		type = "";
	}
	
//operations
	public void eat()
	{
		System.out.println("eating...");

	}
	
	
//getter	
	public String getType()
	{
		return type;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	
	
}
