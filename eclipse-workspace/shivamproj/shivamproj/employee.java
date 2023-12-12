package shivamproj;
public class employee extends worker{
	private long employeeid;
	private String hiredate;
	private static int employeeno=1;
	public employee(){
		System.out.println("hello");
	}
	@Override
	public String toString() {
		return "employee [employeeid=" + employeeid + ", hiredate=" + hiredate + "]"+super.toString();
	}
	public employee(String name, String birthdate, String enddate,String hiredate) {
		super(name, birthdate, enddate);
		this.employeeid=employee.employeeno++;
		this.hiredate=hiredate;
		// TODO Auto-generated constructor stub
	}
}



