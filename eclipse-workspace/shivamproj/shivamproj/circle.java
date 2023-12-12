package shivamproj;

public class circle {
private double radius;
public double area;

public circle(double radius) {
	super();
	if(radius<0) {
		this.radius=0;
	}
	else {
		
	this.radius = radius;
	}
}

public double getradius() {
	return radius;
}
public double getarea() {
	double area=radius*radius*Math.PI;
//	System.out.println(Math.PI);
	return area;
}
}
