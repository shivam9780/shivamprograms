package shivamproj;

public class stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="\t    \n";
int length=string.length();
//System.out.printf("length is %d%n",length);
//System.out.printf("chr is %c%n",string.charAt(2 ));
//if(string.isEmpty()) {
//	System.out.println("empty");
//	return;
//}
//else {
//	System.out.println(string.length());
//}
if(string.isBlank()) {
	System.out.println("empty");
	return;
}
//else {
	System.out.println(string.length());
//}
	}

}
