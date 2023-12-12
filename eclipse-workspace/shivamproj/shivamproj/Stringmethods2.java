package shivamproj;

public class Stringmethods2 {
public static void main(String[] args) {
	String age="19/11/1982";
	int startingindex=age.indexOf("1982");
	System.out.println("starting"+startingindex);
	System.out.println(age.substring(startingindex));
	System.out.println(age.substring(3, 7));
	String c=String.join("()", "20","11","25");
	System.out.println(c);
	c=c.concat("22");
	String d="hello".concat("/ok").concat("11").concat("u");
			System.out.println(d);
			System.out.println(d.replace("/ok", "-"));
			System.out.println(d.replaceFirst("/ok", "wow"));
			System.out.println(d.replaceAll("11", "22"));
			System.out.println("hello\n".repeat(4).indent(10));
}
}
