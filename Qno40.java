package QNO6to49;


public class Qno40 {
	public static void main(String args[]){
		try{
		int data=30/0;
		System.out.println(data);
		}
		catch(ArithmeticException e){System.out.println(e);}
		finally{System.out.println("I am finally block I will always execute");}
		System.out.println("rest of the code...");
		}
}
