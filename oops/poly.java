package oops;

public class poly {
	public class Cat extends AnimalProperties {
		@Override
		public void sound() {
			System.out.println("Meooww");
		}
	}
	public static void main(String args[]) {
		AnimalProperties anmObj = new poly();
		anmObj.sound();
	}
}
