package shivamproj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal animal=new Animal("generic","huge",400);
doanimalstufff(animal,"slow");
Dog dog=new Dog();
doanimalstufff(dog,"fast");
Dog yorkie=new Dog("yorkie",15);
doanimalstufff(yorkie,"fast");
Dog retriever=new Dog("labrador",65,"floppy","swimmer");
doanimalstufff(retriever,"slow");
Dog s=new Dog("wolf",56);
doanimalstufff(s,"slow");
fish goldie=new fish("goldfish",0.25,2,3);
doanimalstufff(goldie,"fast");
}
	public static void doanimalstufff(Animal animal,String speed) {
		animal.move(speed);
		animal.makenoise();
		System.out.println(animal);
		System.out.println("-----");
	}

}
