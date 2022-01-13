package QNO6to49;

public class Qno27 {
	public static void main(String[] args){
		int arrayVar[] = {19, 6, 17, 23, 14};
		for(int i = 0; i<5; i++)
		{
		for(int j = i+1; j<5; j++)
		{
		if(arrayVar[i] < arrayVar[j])
		{
		int temp = arrayVar[i];
		arrayVar[i] = arrayVar[j];
		arrayVar[j] = temp;
		}
		}
		}
		System.out.println("The Second greatest number is: " + arrayVar[1]);
		}
}
