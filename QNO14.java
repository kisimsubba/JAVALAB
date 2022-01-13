package QNO6to49;

import java.util.Scanner;
public class QNO14 {
	public static void main(String[] args){
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = input.nextInt();
		System.out.print("Enter second number: ");
		int n2 = input.nextInt();
		for(num=n1; num<=n2; num++)
		{
		int count=0;
		for(int i=2; i<=num/2; i++)
		{
		if(num%i==0)
		{
		count++;
		break;
		}
		}
		if(count == 0 && num != 1)
		System.out.print(num + "\n");
		}
		}

}
