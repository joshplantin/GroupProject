package groupProject;
import java.util.Arrays;
import java.util.Scanner;
public class Task2 {
public static void main(String[]args) {
	//Using Scanner create an array of countries. When an
	//array is created, retrieve all values from it and while
	//retrieving those values print capital for each country.
	//(use 2 different loops).
	
	Scanner scan = new Scanner(System.in);
    System.out.print("Enter the array size");
    int size=scan.nextInt();
    String[] country=new String [size];
    String[] capital=new String [size];
    scan.nextLine();
    for(int i=0; i<size; i++) {
   System.out.println("Please enter country name");
   country[i]=scan.nextLine();
   System.out.println("Please enter capital of that country");
   capital[i]=scan.nextLine();
    
    }
    System.out.println(Arrays.toString(country));
    System.out.println(Arrays.toString(capital));
    
    for(String countries: country) {
    	System.out.println(countries);
    }
    	
    	for(String capitals: capital) {
    		System.out.println(capitals);
    	}
    }
}
