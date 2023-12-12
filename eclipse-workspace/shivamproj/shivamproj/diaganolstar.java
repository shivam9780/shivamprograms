package shivamproj;
import java.util.*;
public class diaganolstar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == 1 || i == n) && (j == 1 || j == n)) {
                    System.out.print("*");
                } else if ((i == 2 || i == n - 1) && (j == 3 || j == n - 2)) {
                    System.out.print(" ");
                } else if ((i == 3 || i == n - 2) && (j == 2 || j == n - 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
	}

}
