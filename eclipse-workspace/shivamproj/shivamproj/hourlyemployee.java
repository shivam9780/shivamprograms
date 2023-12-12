package shivamproj;

public class hourlyemployee extends employee {
	private double hourlypayrate;
	public hourlyemployee(String name, String birthdate,  String hiredate, String enddate,double hourlypayrate) {
		super(name, birthdate, hiredate,enddate);
		// TODO Auto-generated constructor stub
	}
	public double getdoublepay() {
		System.out.println("double pay");
		return  40 *hourlypayrate;
	}
}
