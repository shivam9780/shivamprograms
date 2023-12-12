package shivamproj;

public class formatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String textblock="""
//				hello:
//					\u2022 how are:	
//					\u2022 u:
//				
//				
//				""";
//System.out.println(textblock);
//		int age=22;
//		int birth=12;
//		System.out.printf("age=%d, birth=%d",age,birth);
//		System.out.println("");
//		System.out.printf("ahe=%.2f%n", (float)age);
//		for(int i=1;i<10000;i*=10) {
//			System.out.printf("number %6d %n",i);
//		}
		String fs=String.format("age is %d", 33);
		System.out.println(fs);
		fs="ur age s %d".formatted(33);
		System.out.println(fs);
	}

}
