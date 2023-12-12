package shivamproj;
import java.util.*;
public class butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a value");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		
		
		
//		
		System.out.print("*");
	}
		for(int k=1;k<=2*(n-i);k++) {
			System.out.print(" ");
		}
//		for(int d=i;d<n;d++) {
//			System.out.print(" ");
//		}
		for(int z=1;z<=i;z++) {
			
			System.out.print("*");
//			
		}
//		System.out.println("");
	
	System.out.println("");
}
	
for(int i=1;i<n;i++) {
	for(int j=i;j<n;j++) {
		System.out.print("*");
	}
	for(int k=1;k<=i;k++) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print(" ");
	}
	for(int j=i;j<n;j++) {
		System.out.print("*");
	}
	System.out.println("");
}
	}
}
