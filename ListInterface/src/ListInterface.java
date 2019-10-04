import java.util.ArrayList;
import java.util.List;

public class ListInterface
{
	public static void main(String[] args)
	{
		List<String> names = new ArrayList();
		var names2 = new ArrayList<String>();
		
		names.add("Ann");
		names.add("Cindy");
		System.out.println(names);
		
		names.add(1, "Bob");
		System.out.println(names);
		
		names.remove(0);
		names.set(0,"Donald");
		String name1 = names.get(1);
		System.out.println(name1);
		
		int size = names.size();
		System.out.println("Size: " + size);
		
		
		names.forEach(name -> System.out.println(name));
		for (String name: names)
			System.out.println(name);
		
	}
}
