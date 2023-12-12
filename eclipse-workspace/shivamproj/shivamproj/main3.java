package shivamproj;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//salariedemployee s=new salariedemployee();
employee e=new employee("shivam","29/09/2000","23/09/2031","23/12/1212");
//employee e1=new employee();
System.out.println(e);
salariedemployee d=new salariedemployee("ss","222","223","!",1234,true);
System.out.println(d);
System.out.println(d.collectpay());
d.retire();
System.out.println(d.collectpay());
hourlyemployee h=new hourlyemployee("a","b","c","d",15);
System.out.println(h);
System.out.println(h.collectpay());
System.out.println(h.getdoublepay());
//String name, String birthdate, String enddate, String hiredate,double annualsalary,boolean isretired
//String name, String birthdate, String enddate,long employeeid,String hiredate
	}

}
