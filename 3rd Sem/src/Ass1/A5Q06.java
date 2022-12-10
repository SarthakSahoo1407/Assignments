package Ass1;
import java.util.Scanner;

public class A5Q06 {
	public static int count(String str) {
		if (str == null || str.isEmpty())
			return 0;
		String[] words = str.split("\\s+");
		return words.length;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentaence: ");
		String str = sc.nextLine();
		System.out.println(count(str));
		sc.close();
	}

}
