package Constructor;

public class Student_06 extends Person_06 {
	int regno;
	String course;
	String Name;
	String DOB;

	Student_06(int regno, String course) {
		super();// person
		this.regno = regno;
		this.course = course;
	}

	public Student_06(int id, String Name, String DOB, int regno, String course) {
		super(id, Name, DOB);
		this.regno = regno;
		this.course = course;
	}

}
