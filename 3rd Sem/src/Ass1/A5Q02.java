package Ass1;
import java.util.ArrayList;
import java.util.Scanner;

public class A5Q02 {
	static ArrayList<Integer> table = new ArrayList<Integer>();
	static void P2(int n) {
		table.add(n);
		table.add(n ^ 1);
		table.add(n ^ 1);
		table.add(n);
	}

	static void P4(int n) {
		P2(n);
		P2(n ^ 1);
		P2(n ^ 1);
		P2(n);
	}

	static void P6(int n) {
		P4(n);
		P4(n ^ 1);
		P4(n ^ 1);
		P4(n);
	}

	static void LOOK_UP() {
		P6(0);
		P6(1);
		P6(1);
		P6(0);
	}
	static int parity(int num) {
		int max = 16;
		while (max >= 8) {
			num = num ^ (num >> max);
			max = max / 2;
		}
		return table.get(num & 0xff);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		LOOK_UP();

		int result = parity(num);
		System.out.println(result);

		if (result != 0) {
			System.out.println("Odd parity");

		} else
			System.out.println("Even parity");
		sc.close();
	}
}
