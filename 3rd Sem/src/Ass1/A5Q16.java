package Ass1;

public class A5Q16 {
	public static void rotateLeft(int array[], int d, int n) {
		for (int i = 0; i < d; i++)

			rotateArrayByOne1(array, n);
	}
	public static void rotateArrayByOne1(int array[], int n) {
		int i, temp;

		temp = array[0];
		for (i = 0; i < n - 1; i++)

			array[i] = array[i + 1];
		array[i] = temp;
	}

	public static void rotateRight(int array[], int d, int n) {
		for (int i = 0; i < d; i++)

			rotateArrayByOne1(array, n);
	}
	public static void rotateArrayByOne(int array[], int n) {
		int i, temp;

		temp = array[n - 1];
		for (i = n - 1; i > 0; i--)

			array[i] = array[i - 1];
		array[0] = temp;
	}

	public static void main(String[] args) {
		int array[] = {11, 22, 33, 44, 55, 66, 77};

		int r = 1;

		int n = array.length;
		System.out.println("Array before rotation: ");
		for (int i = 0; i < n; i++) {

			System.out.print(array[i] + " ");
		}
		System.out.println();
		rotateLeft(array, r, n);
		System.out.println("\nArray after left rotation: ");
		for (int i = 0; i < n; i++) {

			System.out.print(array[i] + " ");
		}

	}
}
