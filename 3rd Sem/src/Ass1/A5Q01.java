package Ass1;
import java.util.Scanner;

public class A5Q01 {

	static int count(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n >>= 1;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		System.out.println(
				"No. of bits in the nnumber is " + count(sc.nextInt()));
		sc.close();
	}

}
