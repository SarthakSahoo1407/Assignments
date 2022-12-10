package Ass1;
import java.util.Scanner;
public class A5Q11 {
	public static String reverseWord(String str) {
		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		return reverseWord.trim();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String str = sc.nextLine();
		System.out.println(reverseWord(str));

		sc.close();

	}

}
