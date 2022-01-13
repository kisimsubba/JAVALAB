package QNO6to49;

class Animals{
void eat(){
System.out.println("Eating...");
}
}

class Dog extends Animals{
void speak(){
System.out.println("Bark Brak...");
}
}
class BullDog extends Dog{
void sleep(){
System.out.println("zzzzzzzz...");
}
}

public class Qno41 {
public static void main(String[] args){
	BullDog a = new BullDog();
a.eat();
a.speak();
a.sleep();
}
}