import java.util.Scanner;
package bujji;

public class Bujji {
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	if (num1>num2) {
		System.out.println("number1 is greater");
	}
	else {
		System.out.println("num1=num2");
	}
	

}
