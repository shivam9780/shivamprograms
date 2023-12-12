package shivamproj;

public class Main2 {
public static void main(String[] args) {
	lion s=new lion("shiv","big",82.00);
	hello(s,"fast");
	tiger t=new tiger("wows",23.0,"hello","well");
	hello(t,"23");
	t.movement("23");
//			String name, Double weight, String tail, String shape
//	tiger t=new tiger("wow",34.00,"oll","square");
//	hello(t,"slow");
//			String name, Double weight, String tail, String shape
	
}
public static void hello(lion animal,String speed) {
	animal.movement(speed);
	animal.makenoise(speed);
	System.out.println(animal);
	System.out.println();
}
}
