package shivamproj;

public class shivamproj2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			LPAstudent p=new LPAstudent("S3900"+i,
					switch(i) {
					case 1->"ram";
					case 2->"sham";
					case 3->"wow";
					case 4->"hello";
					case 5->"okkk";
					default ->"anonymous";
					},
					"5/11/1984",
					"java"
					
					
					);
			System.out.println(p);
		}
		
		pojo s=new pojo("888","vvv","uuv","vuyy");
		LPAstudent record =new LPAstudent("3e","dv","fhdfdhj","bhd");
		System.out.println(s);
		System.out.println(record);
		System.out.println(s.getName());
		System.out.println(record.name());
//		System.out.println()
		s.setClasslist(s.getClasslist()+"this is me");
		System.out.println(s.getClasslist());
		
		//in this we just use simple argument name for record to fetch the data
	}

}
