package shivamproj;
import java.util.*;
public class leet {

	public static void main(String[] args) {
		int z=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.next();		// TODO Auto-generated method stub
		int d=s.length();
	for(int i=s.length();i>0;i--) {
		
		if(s.substring(z).equals(s.substring(d))) {
			System.out.println("matched");
		}
		d=d-1;
	}
	}
}
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
/*
class Solution {
public int strStr(String haystack, String needle) {
    int i=0;
    int v=needle.length();
    for( i=1;i<haystack.length();i++){
        if(haystack.substring(i,i+v).equals(needle)){
           
            return i;
        }
        else{
            return i=-1;
        }
       
    }
   return i; 
}

}
*/