package Ass1;
import java.util.Scanner;
public class A5Q05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Word: ");
		StringBuffer sb = new StringBuffer(sc.next());

		System.out.println(sb.reverse());
		sc.close();
	}

}
