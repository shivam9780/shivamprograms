package shivamproj;

public class Animal {
protected String type;
private String size;
private double weight;
public Animal() {
	
}
	@Override
public String toString() {
	return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + "]";
}
	public Animal(String type, String size, double weight) {
	super();
	this.type = type;
	this.size = size;
	this.weight = weight;
}
	public void move(String speed) {
		System.out.println(type+"moves"+speed);
	}
	public void makenoise() {
//		System.out.println(type+"makes noise");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
