package shivamproj;

public class lion {
private String name;
private String type;
private Double weight;
public lion(String name, String type, Double weight) {
	super();
	this.name = name;
	this.type = type;
	this.weight = weight;
}
public lion() {
	System.out.println("empty constructor");
}
public lion(String sa) {
	this(sa,"vv",3544444444.00);
}
@Override
public String toString() {
	return "lion [name=" + name + ", type=" + type + ", weight=" + weight + "]";
}
public void movement(String speed) {
	System.out.println(name+"moves"+type+"runs at"+speed);
}
public void makenoise(String s) {
	
	System.out.println("makes noise");
}
}
