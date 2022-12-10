package Ass1;

public class A5Q14 {
	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 5, 2, 1, 6, 8, 1, 4, 5, 4, 1, 2, 1, 1, 2, 5, 1, 2,
				2, 5, 4, 1, 2, 5, 4, 1, 1, 5, 5, 4, 7, 4, 5, 1, 2, 1};

		int freq[] = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					freq[j] = visited;

				}
			}
			if (freq[i] != visited) {
				freq[i] = count;
			}
		}

		System.out.println(" Element | Frequency");
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != visited)
				System.out.println("    " + arr[i] + "      |      " + freq[i]);
		}
	}
}
