package shivamproj;

public class referenceextend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		referenceandobject c=new referenceandobject("blue");
		referenceandobject d=c;
		System.out.println(c.getColor());
		d.setColor("orange");
		System.out.println(c.getColor());
		System.out.println(d.getColor());
		referenceandobject s=new referenceandobject("yellow");
		d=s;
		System.out.println(s.getColor());
		System.out.println(d.getColor());
	}

}
