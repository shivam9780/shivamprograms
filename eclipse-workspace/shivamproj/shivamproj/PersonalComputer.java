package shivamproj;

//import shivamproj.product.motherboard.computercase;

public class PersonalComputer extends product {

public PersonalComputer(String model,String manufacturer,computercase computerCase, monitor monitor, motherboard motherboard) {
		super(model,manufacturer);
		ComputerCase = computerCase;
		Monitor = monitor;
		Motherboard = motherboard;
	}
public computercase getComputerCase() {
	return ComputerCase;
}
public monitor getMonitor() {
	return Monitor;
}
public motherboard getMotherboard() {
	return Motherboard;
}
private computercase ComputerCase;
private monitor Monitor;
private motherboard Motherboard;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
