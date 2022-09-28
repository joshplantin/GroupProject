package groupProject;
import java.util.Scanner;
public class Task1 {
public static void main(String[]args) {
	// Using Scanner create an array of integer values. After
	//the array is created, calculate the sum of all stored
	//elements in that array.
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter array size");
	int size=scan.nextInt();
	int[] arr=new int[size];
	for(int i=0; i<size; i++) {
		System.out.println("Please enter integer");
		arr[i]=scan.nextInt();
	}
	int sum=0;
	for(int num: arr) {
		sum+=num;
	}
	System.out.println(sum);
	
	
	
	
	
			
	
}
}
