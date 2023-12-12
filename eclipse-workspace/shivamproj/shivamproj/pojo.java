package shivamproj;

public class pojo {

	@Override
	public String toString() {
		return "pojo [id=" + id + ", name=" + name + ", dob=" + dob + ", classlist=" + classlist + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getClasslist() {
		return classlist;
	}
	public void setClasslist(String classlist) {
		this.classlist = classlist;
	}
	private String id;
	private String name;
	private String dob;
	private String classlist;
	public pojo(String id, String name, String dob, String classlist) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.classlist = classlist;
	}

}




/*public class Pojo {
    private String id;
    private String name;
    private String dob;
    private String classlist;

    public Pojo(String id, String name, String dob, String classlist) {
        // Use setters for validation during object creation
        setId(id);
        setName(name);
        setDob(dob);
        setClasslist(classlist);
    }

    // Other getters and setters for name, dob, and classlist remain the same...

    public String getId() {
        return id;
    }

    public void setId(String id) {
        // Adding logic to validate the length of the id
        if (id.length() == 5) {
            this.id = id;
        } else {
            // Display an error or handle it as per your requirement
            throw new IllegalArgumentException("ID should be a 5-character string.");
        }
    }
}
*/


/*public class Main {
    public static void main(String[] args) {
        Pojo myObject = new Pojo("12345", "John", "2000-01-01", "Math");
        // This will work because "12345" is a 5-character string

        // Attempting to create an object with an invalid id
        Pojo invalidObject = new Pojo("123", "Jane", "1995-06-15", "Science");
        // This will throw an IllegalArgumentException due to the invalid id
    }
}

*/  //to be done later
