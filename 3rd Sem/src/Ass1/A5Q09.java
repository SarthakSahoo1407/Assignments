package Ass1;
import java.util.Scanner;

public class A5Q09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the letter to encode: ");
		String x = sc.next().toUpperCase();
		char y[] = new char[x.length()];

		for (int i = 0; i < y.length; i++) {
			y[i] = x.charAt(i);
		}

		if (y.length == 1) {
			for (int i = 0; i < y.length; i++) {
				System.out.println((int) y[i] - 64);
			}
		} else {
			int sum = 0;
			int num[] = new int[y.length];
			for (int i = 0; i < num.length; i++) {
				num[i] = (int) y[i] - 64;
			}

			for (int i = 0; i < num.length; i++) {
				sum += num[i];
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
