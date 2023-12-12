package shivamproj;

public class salariedemployee extends employee{
	private double annualsalary;
	private boolean isretired;
//	public salariedemployee()
	
	public salariedemployee(String name, String birthdate, String enddate, String hiredate,double annualsalary,boolean isretired) {
		super(name, birthdate, enddate, hiredate);
		this.annualsalary=annualsalary;
		this.isretired=isretired;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "salariedemployee [annualsalary=" + annualsalary + ", isretired=" + isretired + "]"+super.toString();
	}
	public double collectpay() {
		double paycheck=annualsalary/26;
		double adjustedpay=(isretired)?3.9*paycheck:paycheck;
		return (int)adjustedpay;
	}
	public void retire() {
		termnate("21/11/2023");
		isretired=true;
	}
	

}
