package QNO6to49;

public class Qno29 {
	public static void main(String[] args){
		int arrayVar[] = {13,7,2};
		for(int i = 0; i<3; i++)
		{
		for(int j = i+1; j<3; j++)
		{
		if(arrayVar[i] > arrayVar[j])
		{
		int temp = arrayVar[i];
		arrayVar[i] = arrayVar[j];
		arrayVar[j] = temp;
		}
		}
		}
		System.out.println("The Second smallest number is: " + arrayVar[1]);
		}
}
