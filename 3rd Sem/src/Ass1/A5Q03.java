package Ass1;
import java.util.Scanner;
public class A5Q03 {

	static int swap(int n, int p, int q) {
		int bit1 = (n >> p) & 1;
		int bit2 = (n >> q) & 1;

		int x = (bit1 ^ bit2);

		x = (x << p) | (x << q);

		int result = n ^ x;

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int x = sc.nextInt();
		System.out.print("ith bit: ");
		int y = sc.nextInt();
		System.out.print("jth bit: ");
		int z = sc.nextInt();
		System.out.println("x =" + x);
		System.out.println("After Swapping = " + swap(x, y, z));
		sc.close();
	}

}
