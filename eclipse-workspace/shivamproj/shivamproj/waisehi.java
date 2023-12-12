package shivamproj;

import java.util.Scanner;

public class waisehi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
//		System.out.println(n);
		for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
		for(int j=i;j<n;j++) {
			System.out.print("* ");
		}
		System.out.println("");
//		System.out.println(n);
//		n=n-1;
//		System.out.println(n);
	}
}
}
