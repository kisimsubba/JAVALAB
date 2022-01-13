package QNO6to49;

public class Qno37 {
	String bookName;
	String authorName;
	int price;
	Qno37(String bookName, String author, int price){
	this.bookName = bookName;
	this.authorName = authorName;
	this.price = price;
	}
	void infoDisplay(){
	System.out.println("Book Name: " + bookName);
	System.out.println("Book Author: " + authorName);
	System.out.println("Book Price: " + price);
	}
	public static void main(String[] args){
	Qno37 aa = new Qno37("JAVA","kisim Subba",1000);
	aa.infoDisplay();
	}
}
