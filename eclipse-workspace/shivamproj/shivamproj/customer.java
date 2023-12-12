package shivamproj;

public class customer {
	private String name;
	private double creditlimit;
	private String email;
	public customer(String name,double creditlimit,String email) {
		this.name=name;
		this.creditlimit=creditlimit;
		this.email=email;
	}
	public customer() {
		this("shivam",3000,"s@gmail.com");
	}
	public customer(String name,String email) {
		this(name,4000,email);
	}
	public String getName() {
		return name;
	}
	public double getCreditlimit() {
		return creditlimit;
	}
	public String getEmail() {
		return email;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
customer c=new customer();
System.out.println(c.getCreditlimit());
System.out.println(c.getEmail());
System.out.println(c.getName());
	}

}
