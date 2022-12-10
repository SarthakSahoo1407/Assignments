package Ass1;
import java.util.Scanner;
public class A5Q08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		String a = sc.next();
		System.out.print("Enter b: ");
		String b = sc.next();
		sc.close();

		int i = 0;
		int j = 0;
		StringBuilder sum = new StringBuilder("");
		int carry = 0;
		for (i = a.length() - 1, j = b.length() - 1; i >= 0
				|| j >= 0; i--, j--) {
			int indiv1 = 0;
			if (i >= 0)
				indiv1 = Integer.parseInt("" + a.charAt(i));
			int indiv2 = 0;
			if (j >= 0)
				indiv2 = Integer.parseInt("" + b.charAt(j));
			int summation = indiv1 + indiv2 + carry;
			double d = Math.floor(summation / 10);
			carry = (int) d;
			int sum2 = summation % 10;
			sum.append(sum2);
		}
		System.out.println(sum.reverse());
	}

}
