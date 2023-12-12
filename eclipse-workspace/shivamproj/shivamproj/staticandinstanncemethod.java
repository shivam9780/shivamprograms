package shivamproj;
class calculator{
	public static void printsum(int a,int b) {
		System.out.println(a+b);
	}
}
public class staticandinstanncemethod {

	public static void main(String[] args) {
		calculator.printsum(10, 20);
		printhello(); 
		
		calculator c=new calculator();
		c.printsum(100,2000);  // this is the one we called directly using instance the static method
		// TODO Auto-generated method stub

	}
	public static void printhello() {
		System.out.println("hello");  //if in the same class like staticandinstanncemethod u just need to print the method name in the main class
	}

}


//instance methods are the one we are using