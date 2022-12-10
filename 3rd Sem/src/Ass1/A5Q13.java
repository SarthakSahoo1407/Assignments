package Ass1;

import java.util.Scanner;

public class A5Q13 {
	static int frequency(int n, int d) {
		int c = 0;
		while (n > 0) {
			if (n % 10 == d) {
				c++;
			}
			n = n / 10;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.print("Enter the digit: ");
		int d = sc.nextInt();
		int freq = frequency(n, d);
		System.out.println("Frequency of " + d + " is " + freq);
		sc.close();
	}

}
