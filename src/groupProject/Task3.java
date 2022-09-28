package groupProject;

public class Task3 {
	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of
		// all numbers.
		int[][] arr = { { 10, 25, 40, 55, 60 }, { 59, 23, 43, 61, 61 } };
		int sum = 0;
		for (int[] arrs : arr) {
			for (int num : arrs) {
				sum += num;

			}

		}
		System.out.println(sum);

	}
}