package shivamproj;

public class personalcomputermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computercase c=new computercase("2002","dell","2200v"); 
		monitor m=new monitor("2306","wipro",116,1020);
		motherboard b=new motherboard("bj-200","asus",4,6,"v2.44"); 
		PersonalComputer pc=new PersonalComputer("2208","dell",c,m,b);
		pc.getMonitor().drawpixel(10, 20, "red");
		System.out.println(pc.getComputerCase());
	}

}
