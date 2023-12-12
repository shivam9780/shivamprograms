package shivamproj;

public class worker {
	private String name;
	private String birthdate;
	private String enddate;
	public int getage() {
		
		
		return 1;
	}
	public worker() {
		System.out.println("wow");
	}
	@Override
	public String toString() {
		return "worker [name=" + name + ", birthdate=" + birthdate + ", enddate=" + enddate + "]";
	}
	public worker(String name,String birthdate,String enddate) {
		this.name=name;
		this.birthdate=birthdate;
		this.enddate=enddate;
	}
	public double collectpay() {
		
		System.out.println("cllectedpay");
		return 22.00;
	}
	public void termnate(String enddate) {
		System.out.println("terminated"+enddate);
	}	
}
