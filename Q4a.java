package javaQ;

public class Q4a {
	public static void main(String[]args) {
		//simple if
//		if(20> 18) {
//			System.out.print("20 is greater than 18");
//		}
		
		//if else
//		boolean name = true;
//		if(name==true) {
//			System.out.println("kisim");
//		}else {
//			System.out.println("hello");
//		}
		
		//ladder if else
		
//		int choose = 0;
//		if(choose == 1) {
//			System.out.println("sunday");
//		
//		}else if(choose ==2){
//			System.out.println("monday");
//		}else{
//			System.out.println("invalid");
//		}
		
		//nested if 
		int n = -6;
		if(n > 0) 
		{
			if(n%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
		}else 
		{
			if(n%2==0) {
				System.out.println("negative even");
			}else {
				System.out.println("negative odd");
			}
		}
			
			
	}
}
