package QNO6to49;

class Wood{
void create(){
System.out.println("Wood is created..");
}
}

class Foam extends Wood{
void insert(){
System.out.println("Foam inserted..");
}
}

class Duster extends Wood{
void apply(){
System.out.println("Wood applied..");
}
}

public class Qno38{
public static void main(String[] args){
Duster Dus = new Duster();
Dus.create();
Dus.apply();
//d.insert();//compile time error
}
}
