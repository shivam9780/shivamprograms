package shivamproj;

public class cylinder extends circle{
	private double height;

	public cylinder(double radius,double height) {
		super(radius);
		if(height<0) {
			this.height=0;
			}else {
				
		this.height=height;
			}
		// TODO Auto-generated constructor stub
	}
	public double getheight() {
		
		return height;
	}
	public double getvolume() {
		System.out.println(super.getarea());
		return super.getarea()*height;
	}

}
