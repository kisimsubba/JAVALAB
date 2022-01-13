package javaQ;

import java.util.*;

public class Q3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose no of days");
		int day =sc.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
			
		case 2:
			System.out.println("Monday");
			break;
			
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4:
			System.out.println("Wed");
			break;
			
		case 5:
			System.out.println("thur");
			break;
			
		case 6:
			System.out.println("friday");
			break;
			
		case 7:
			System.out.println("sat");
			break;
			
		default:
			System.out.print("invalid");
			
		sc.close();
		}
		
	}
}
