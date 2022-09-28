package groupProject;

public class Task9 {
//find the maximum and minimum number in an array
	public static void main(String[] args) {
		int[] arr = { 5, 500, 1346, 123, 833, 1345 };
		int min=arr[0];
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			 if(arr[i]<min) {
			 min=arr[i];
			 }
			 if(arr[i]>max) {
				 max=arr[i];
			 }
		}
		System.out.println(min);
		System.out.println(max);
	}
}
