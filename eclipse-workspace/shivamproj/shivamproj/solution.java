package shivamproj;

public class solution {
	public int strStr(String haystack, String needle) {
		 int i;
		    int v=needle.length();
		    for( i=0;i<haystack.length();i++){
		    	 //System.out.println(haystack.substring(i,i+v));
		        if(haystack.substring(i,i+v).equals(needle)){
		          
		            return i;
		        }
		        
		    }
		   return i=-1; 
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
solution s=new solution();
System.out.println(s.strStr("a", "a"));
	}

}
