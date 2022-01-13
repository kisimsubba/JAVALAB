package QNO6to49;

public class QNo26 {
	public static void main(String[] args){
		int arrayVar[] = {2, 14, 6, 18};
		for(int i = 0; i<4; i++)
		{
		for(int j = i+1; j<4; j++)
		{
		if(arrayVar[i] < arrayVar[j])
		{
		int temp = arrayVar[i];
		arrayVar[i] = arrayVar[j];
		arrayVar[j] = temp;
		}
		}
		}
		System.out.println("The largest elements is: " + arrayVar[0]);
		}
}
