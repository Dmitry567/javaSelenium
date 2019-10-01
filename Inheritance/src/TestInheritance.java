
public class TestInheritance
{
	public static void main(String[] args)
	{
		Dog dog = new Dog("Small dog", "Tuzik", "Chihuahua");
		dog.bark();
		dog.eat();
		System.out.println("Dog`s type:" + dog.getType());
		System.out.println("Dog`s name:" + dog.getName());
		
		Animal animal = new Animal("A scary animal");
		
		Animal a = new Dog("Very big dog", "Rex", "Labrador");
		System.out.println("Dog`s type:" + a.getType());
		a.eat();
//		a.getName();
	}
}
