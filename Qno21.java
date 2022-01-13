package QNO6to49;

public class Qno21 {
	public static void main(String[] args){
		int num,sum=0;
		for(num=1; num<=100; num++)
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
		sum+=num;
		}
		System.out.print("Sum of prime number between 1 to 100 is " + sum);
		}
}
