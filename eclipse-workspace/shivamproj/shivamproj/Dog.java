package shivamproj;

public class Dog extends Animal {
	private String earshape;
	private String tailshape;
	

	public Dog(String type,double weight,String earshape,String tailshape) {
		super(type,weight<15 ? "small" :(weight <35 ? "medium":"large"),weight);
		this.earshape=earshape;
		this.tailshape=tailshape;
	}
public Dog(String type,double weight) {
	this(type,weight,"perky","curled");
}
	@Override
	public String toString() {
		return "Dog [earshape=" + earshape + ", tailshape=" + tailshape + "]"+super.toString();
	}

	public Dog() {
		super("eed","vvs",2000);
	}
	public void makenoise() {
		if(type=="wolf") {
			System.out.println("oh woooooo");
		}
		bark();
		System.out.println();
	}
	public void move(String speed) {
		super.move(speed);
		if(speed=="slow") {
			walk();
			wagtail();
		}
		else {
			run();
			bark();
		}
		System.out.println();
//		System.out.println("dog walks run an wag their tail");
	}
	private void bark() {
		System.out.println("woof");
	}
	private void run() {
		System.out.println("running");
	}
	private void walk() {
		System.out.println("walking");
	}
	private void wagtail() {
		System.out.println("wag tailing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
