package tutorial1;

public interface Vehicle {
	
	final int gears = 5;
	
	void changeGear(int a);
	void speedUp(int a);
	void slowDown(int a);
	
	default void out() {
		System.out.println("Default method");
	}
}
