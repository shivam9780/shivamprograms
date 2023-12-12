package shivamproj;

public class product {
private String model;
private String manufacturer;
private int width;
private int depth;
private int height;
public product(String model,String manufacturer) {
	this.model=model;
	this.manufacturer=manufacturer;
	
}
public product() {
	
}
public static void main(String[] args) {
	
}
}
class monitor extends product{
	private int size;
	private int resolution;
	public monitor(String model, String manufacturer, int size, int resolution) {
		super(model, manufacturer);
		this.size = size;
		this.resolution = resolution;
	}
	public monitor(String model,String manufacturer) {
		super(model,manufacturer);
}
	public void drawpixel(int x,int y,String color) {
		System.out.println(String.format( "drawing pixel at %d and %d in color %s",x,y,color ));
	}
}
class motherboard extends product{
	private int ramslots;
	private int cardslots;
	private String bios;
	
	public motherboard(String model, String manufacturer, int ramslots, int cardslots, String bios) {
		super(model, manufacturer);
		this.ramslots = ramslots;
		this.cardslots = cardslots;
		this.bios = bios;
	}
	public motherboard(String model,String manufacturer) {
		super(model,manufacturer);
	}
	public void loadprogram(String programName) {
		System.out.println("program"+programName+" is now loading");
}
}
	class computercase extends product{
		private String powersupply;
		public computercase(String model, String manufacturer, String powersupply) {
			super(model, manufacturer);
			this.powersupply = powersupply;
		}
		public computercase(String model,String manufacturer) {
			super(model,manufacturer);
		}
		public void pressPowerButton() {
			System.out.println("button presses");
		}
	}
	


