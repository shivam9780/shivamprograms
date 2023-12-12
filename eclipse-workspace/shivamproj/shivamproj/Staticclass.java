package shivamproj;

public class Staticclass {
private static String name;
public Staticclass(String name) {
	this.name=name;
	Staticclass.name=name;  //both the lines are same
}
public void printname() {
	System.out.println(name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticclass s=new Staticclass("rex");
		Staticclass v=new Staticclass("fluffy");  //both instances are sharing the same variable thats why we dont use static
		s.printname();
		v.printname();
	}

}
