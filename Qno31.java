package QNO6to49;

import java.util.Scanner;
public class Qno31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arrVar = {3, 6, 12, 8, 56, 8, 9, 13};

		System.out.println("Element in Array list:\n");
		for(int i = 0; i < arrVar.length; i++)
		{
		System.out.print(arrVar[i]+" ");
		}
		System.out.print("\nEnter Element to be deleted : ");
		int element = input.nextInt();

		for(int i = 0; i < arrVar.length; i++)
		{
		if(arrVar[i] == element){
		// shifting elements
		for(int j = i; j < arrVar.length - 1; j++){
		arrVar[j] = arrVar[j+1];
		}
		break;
		}
		}

		System.out.println("\nArrayList after deleting element " + element + "\n");
		for(int i = 0; i < arrVar.length-1; i++){
		System.out.print(arrVar[i]+" ");
		}
		}
}
