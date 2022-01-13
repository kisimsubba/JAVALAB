package QNO6to49;

import java.util.Scanner;
public class Qno35 {
	static String name, email;
	static int rollNo;
	static long phoneNo;

	//creating three arguments constructor
	Qno35(String n, int r, String em){
	name = n;
	rollNo = r;
	email = em;
	}

	//creating four arguments constructor
	Qno35(String n, int r, String em, long ph){
	name = n;
	rollNo = r;
	email = em;
	phoneNo = ph;
	}

	void infoDisplay(){
	System.out.println("\nStudent Details");
	System.out.println("Name: "+ name);
	System.out.println("Roll No.: "+ rollNo);
	System.out.println("Email: "+ email);
	System.out.println("Phone Number: "+ phoneNo);
	}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your Details\n");
	System.out.print("What is your name? ");
	name = input.nextLine();

	System.out.print("Enter your roll number: ");
	rollNo = Integer.parseInt(input.nextLine());

	System.out.print("Enter your email: ");
	email = input.nextLine();

	System.out.print("Enter your phone Number: ");
	phoneNo = Long.parseLong(input.nextLine());

	Qno35 s1 = new Qno35(name,rollNo,email,phoneNo);
	s1.infoDisplay();
	//Qn035 s2 = new Qn035(name,rollNo,email);
	//s2.infoDisplay();
	}
}
