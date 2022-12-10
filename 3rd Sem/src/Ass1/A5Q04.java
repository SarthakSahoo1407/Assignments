package Ass1;

import java.util.Scanner;
public class A5Q04 {

	static int multiply(int x, int y) {

		int result = 0;
		while (y != 0) {
			if ((y & 1) != 0) {
				result = result + x;

			}

			x <<= 1;
			y >>>= 1;

		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter x: ");
		int x = sc.nextInt();
		System.out.print("Enter y: ");
		int y = sc.nextInt();

		System.out.println("x * y = " + multiply(x, y));
		sc.close();
	}

}
