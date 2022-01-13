package QNO6to49;

import java.util.*;

public class Qno32 {
	/// Function to add new item in arr
	public static int[] addX(int n, int arr[], int x)
	{
	int i;
	// create a new array of size n+1
	int newarr[] = new int[n + 1];
	for (i = 0; i < n; i++)
	newarr[i] = arr[i];

	newarr[n] = x;
	return newarr;
	}

	public static void main(String[] args)
	{
	int n = 10;
	int i;
	Scanner input = new Scanner(System.in);
	int arr[] ={ 2, 4, 6, 8, 0, 12};
	System.out.println("\nElement Available in Array List:\n" + Arrays.toString(arr));
	System.out.print("\nEnter the new element for array: ");
	int x = input.nextInt();
	arr = addX(n, arr, x);
	System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));
	}
}
