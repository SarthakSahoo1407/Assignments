package Ass1;

public class A5Q15 {
	public static void main(String[] args) {
		int array[] = {1, 1, 5, 7, 2, 9, 5, 1, 85, 7, 5, 5, 85, 4, 12, 5, 7, 1,
				2, 5, 1, 6, 85, 87, 4, 13, 56, 74, 1, 2, 54, 1, 25, 4, 1, 5,
				874, 14, 1, 5};
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			boolean isPrime = true;
			if (array[i] == 1)
				isPrime = false;
			else {
				for (int j = 2; j <= array[i] / 2; j++) {
					if (array[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			if (isPrime) {
				if (array[i] == 0) {
				} else {
					System.out.print(array[i] + " ");
					count++;
				}
			}
		}
		System.out.println("Number of Primes in the array is: " + count);
	}
}
