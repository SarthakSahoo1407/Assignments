package Ass1;
import java.util.Scanner;

public class A5Q07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.next();
		System.out.print("Enter you DOB as ddmmyyy: ");
		String dob = sc.next();
		String pass = "" + name.charAt(0) + name.charAt(1) + dob.charAt(2)
				+ dob.charAt(3);
		System.out.println("Your password is: " + pass);
		sc.close();

	}

}
