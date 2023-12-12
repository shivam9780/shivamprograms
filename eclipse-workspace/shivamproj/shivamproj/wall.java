package shivamproj;
class walls{
private double height;
private double width;
public walls(double height, double width) {
	super();
	if(width <0|| height <0) {
		this.height = 0;
		this.width = 0;
	}
	else {
		
	
	this.height = height;
	this.width = width;
	}
}
public double getHeight() {
	
	return height;
}
public void setHeight(double height) {
	if(this.height<0) {
		this.height=0;
	}
	else {
		
	this.height = height;
	}
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	if(this.width<0) {
		this.width=0;
	}
	else {
		
	this.width = width;
	}
	//this.width = width;
}
public walls() {
	
}
public double getarea() {
	return height*width;
}
}
public class wall {

	public static void main(String[] args) {
		walls w=new walls(-10,20);
		System.out.println(w.getarea());
		// TODO Auto-generated method stub

	}

}
