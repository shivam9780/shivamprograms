package shivamproj;

public class fish extends Animal {
	private int gills;
	private int fins; 
public fish() {
		super();
		// TODO Auto-generated constructor stub
	}
	public fish(String type, double weight,int gills,int fins) {
		super(type, "small", weight);
		// TODO Auto-generated constructor stub
	}
	private void movemuscles() {
		System.out.println("muscles moving");
	}
	private void movebackfin() {
		System.out.println("fins moving");
	}
	public void move(String speed) {
	super.move(speed);
	movemuscles();
	if(speed=="fast") {
		movebackfin();
	}
	System.out.println();
	}
	@Override
	public String toString() {
		return "fish [gills=" + gills + ", fins=" + fins + "]";
	}

}
