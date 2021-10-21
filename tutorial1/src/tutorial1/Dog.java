package tutorial1;



public class Dog {
	private static int count = 0;
	
	protected String name;
	protected int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		Dog.count++;
	}
	
	public static void display() {
		System.out.println("I am a dog!");
	}

}

