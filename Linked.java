package collection;
import java.util.Scanner;
import java.util.LinkedList;
public class Linked {
	public static void main(String[] args) {
		LinkedList dta=new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value number");
		dta.add(sc.nextInt());
		System.out.println("enter the value string");
		dta.add(sc.next());
		System.out.println("enter the value number");
		dta.add(sc.nextInt());
		System.out.println("enter the value string");
		dta.add(sc.next());
		System.out.println(dta);
		LinkedList<String> dta1=new LinkedList<String>();
		dta1.add("bujji");
		dta1.add("Mine");
		System.out.println(dta1);
		for(String aa:dta1) {
			System.out.println(aa);
		}
		dta1.addAll(dta);
		System.out.println(dta);
		System.out.println("after adding to first position");
		dta.addFirst("viji");
		System.out.println(dta);
		System.out.println("after adding to last position");
		dta.addLast(499);
		System.out.println(dta);
		
		
		
	}

}
