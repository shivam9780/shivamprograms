package shivamproj;

public class tiger extends lion {
	
	private String tail;
	private String shape;
	public tiger(String tail, String shape) {
		super();
		
		this.tail = tail;
		this.shape = shape;
	}
	
	public tiger(String name, Double weight, String tail, String shape) {
		super(name, weight<15 ? "smaller" : (weight<35 ? "medium":"larger"), weight);
		this.tail = tail;
		this.shape = shape;
	}
	public tiger(){
//		String name, String type, Double weight
		
		super("well","okthe",23.00);
	}
	public void usingupper(String a) {
		super.makenoise(a);
		System.out.println(a+tail+shape);
	}
	@Override
	public String toString() {
		return "tiger [tail=" + tail + ", shape=" + shape + "]"+super.toString();
	}

}
