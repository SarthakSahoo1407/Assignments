package oops;

//When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.
class Tutor {
	String designate = "Tutor";
	String academyName = "NewAcademy";
	void performs() {
		System.out.println("Tutoring");
	}
}
public class Inherit extends Tutor {
	String subject = "Science";
	public static void main(String args[]) {
		Inherit obj = new Inherit();
		System.out.println(obj.academyName);
		System.out.println(obj.designate);
		System.out.println(obj.subject);
		obj.performs();
	}
}
