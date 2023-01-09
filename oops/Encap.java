package oops;

//Encapsulation is defined as the wrapping up of data under a single unit. It is the mechanism that binds together the code and the data it manipulates. Another way to think about encapsulation is that it is a protective shield that prevents the data from being accessed by the code outside this shield. 

//The variables or the data in a class is hidden from any other class and can be accessed only through any member function of the class in which they are declared.

//In encapsulation, the data in a class is hidden from other classes, which is similar to what data-hiding does. So, the terms “encapsulation” and “data-hiding” are used interchangeably.

//Encapsulation can be achieved by declaring all the variables in a class as private and writing public methods in the class to set and get the values of the variables.
class DemoEncap {
	private int ssnValue;
	private int employeeAge;
	private String employeeName;
	public int getEmployeeSSN() {
		return ssnValue;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int newValue) {
		employeeAge = newValue;
	}
	public void setEmployeeName(String newValue) {
		employeeName = newValue;
	}
	public void setEmployeeSSN(int newValue) {
		ssnValue = newValue;
	}
}
public class Encap {
	public static void main(String args[]) {
		DemoEncap obj = new DemoEncap();
		obj.setEmployeeName("Sarthak Sahoo");
		obj.setEmployeeAge(20);
		obj.setEmployeeSSN(12345);
		System.out.println("Employee Name is: " + obj.getEmployeeName());
		System.out.println("Employee SSN Code is: " + obj.getEmployeeSSN());
		System.out.println("Employee Age is: " + obj.getEmployeeAge());
	}
}