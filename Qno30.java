package QNO6to49;

import java.util.Scanner;
public class Qno30 {
	public static void main(String[] args){
		int count=0, num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number from arraylist: ");
		num = input.nextInt();
		int arrayVar[] = {22, 6, 17, 7, 15, 7, 4, 17, 7, 22, 17};
		for(int i = 0; i < arrayVar.length; i++){
		if(num == arrayVar[i])
		count++;
		}
		if(count!=0)
		{
		System.out.println(num + " is in array is repeated " + count + " times.");
		}else
		{
		System.out.println(num + " is not in array.");
		}
	}
}
