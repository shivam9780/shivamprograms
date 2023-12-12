package shivamproj;

public class classmain extends Object {
	public static void main(String[] args) {
		
//student max=new student("max",21);
//System.out.println(max.toString());
//System.out.println(max);
student2 s=new student2("shivam",22,"carol");
System.out.println(s);
	}
}
class student{
	private String name;
	private int age;
	student(String name,int age){
		this.name=name;
		this.age=age; 
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + "]";
	}
}
class student2 extends student{
	private String parentname;

	 @Override
	public String toString() {
		return "student2 [parentname=" + parentname + "]"+super.toString();
	}

	student2(String name,int age,String parentname) {
		super(name,age);
		this.parentname = parentname;
	}
	
}