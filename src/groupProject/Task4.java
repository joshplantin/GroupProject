package groupProject;

public class Task4 {

	public static void main(String[] args) {
		// 4. Create a 2D array or integer type where you will store
		// odd and even numbers. Develop a program which will
		// identify/print the even numbers only.

		int[][] oddeven = { { 4, 8, 19, 22 }, { 54, 55, 99, 17 }, };

		for (int[] oddsevens : oddeven) {
			for (int arr : oddsevens) {
				if (arr % 2 == 0) {
					System.out.println(arr);
				}

			}
		}

	}

}
