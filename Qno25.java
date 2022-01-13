package QNO6to49;

public class Qno25 {
	public static void main(String[] args){
		int sum = 0;
		int[] arrayVar = {2,4,6,8,9};
		for(int a: arrayVar)
		{
		sum += a;
		}
		float average = sum / 4;
		System.out.println("The Average of array elements is: " + average);
		}
}
