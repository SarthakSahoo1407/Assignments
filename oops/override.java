package oops;

class First {
	public void exampleMethod() {
		System.out.println("This method is to be overridden");
	}
}
public class override extends First {
	public void exampleMethod() {
		System.out.println("Now overriding the method");
	}
	public static void main(String args[]) {
		First obj = new override();
		obj.exampleMethod();
	}
}
