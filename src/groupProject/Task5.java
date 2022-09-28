package groupProject;

public class Task5 {
public static void main(String[] args) {
	//Create a 2D array of integers. Develop a program
	//which will calculate the sum of even and odd numbers
	//for that array.
int[][] arr= {
		{10,52,61,72,25,17},
		{92,17,52,31,92},
		
};
int evensum=0;
int oddsum=0;
for(int[]arrs:arr) {
	for(int arr1:arrs) {
		if(arr1%2==0) {
			evensum+=arr1;
		}
		else {
			oddsum+=arr1;
		}
	}
	
}
System.out.println(evensum);
System.out.println(oddsum);
	
	
}
}
