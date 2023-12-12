package shivamproj;
import java.util.*;
public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
for(int i=1;i<=n;i++) {
	for(int j=i;j<n;j++) {
		System.out.print(" ");
	}
	if(i==n) {
		for(int k=1;k<=n+1;k++) {
			System.out.print("* ");
		}
//		continue;
	}else {
	for(int j=1;j<=i;j++) {
		
		System.out.print("* ");
	}
	for(int z=i;z<n;z++) {
		System.out.print(" ");
	}
	}
	System.out.println("");
}
	}

}
