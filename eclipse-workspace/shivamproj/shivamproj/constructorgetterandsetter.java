package shivamproj;
//
//public class constructorgetterandsetter {
//private int age;
//
//	public constructorgetterandsetter(int age) {
//	super();
//	this.age = age;
//}
//
//	public int getAge() {
//	return age;
//}
//
//public void setAge(int age) {
//	this.age = age;
//}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		constructorgetterandsetter c=new constructorgetterandsetter(22);
//		System.out.println(c.getAge());
//	}
//
//}
public class constructorgetterandsetter {
    private int age;

    public constructorgetterandsetter(int age) {
        super();
        setAge(age); // Use the setter for validation during object creation
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Adding validation logic for age within a valid range (e.g., 0 to 120)
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            // Optionally, handle invalid age (throw exception, set default value, etc.)
            System.out.println("Invalid age. Age should be between 0 and 120.");
            // this.age = 0; // Setting a default value, if required
            // throw new IllegalArgumentException("Invalid age. Age should be between 0 and 120.");
        }
    }

    public static void main(String[] args) {
    	constructorgetterandsetter c = new constructorgetterandsetter(122);
        System.out.println(c.getAge());
    }
}
