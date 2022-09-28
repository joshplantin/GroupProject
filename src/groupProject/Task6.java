package groupProject;
import java.util.Scanner;
public class Task6 {
public static void main(String[]args) {
//6. Write a program to swap 2 numbers without a
//temporary variable
Scanner scan=new Scanner(System.in);
System.out.println("Please enter first number");
int num1=scan.nextInt();

System.out.println("Please enter second number");
int num2=scan.nextInt();

int a=num1+num2;
int num3=a-num1;
int num4=a-num2;

System.out.println("After swapping numbers the first number is "+num3);
System.out.println("After swapping numbers the second number is "+num4);



}
}
