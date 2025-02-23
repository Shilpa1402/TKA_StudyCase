package Constructor;

import java.time.LocalDate;

public class Student_07_02 {
	int Id;
	String Name;
	LocalDate DOB;
	String Course;
	String MobNumber;

	public Student_07_02() {
		super();
		System.out.println("Cons of Students");
	}

	public Student_07_02(int id, String name, LocalDate dOB, String course) {
		super();
		Id = id;
		Name = name;
		DOB = dOB;
		Course = course;

	}

	public Student_07_02(int id, String name, LocalDate dOB, String course, String mobNumber) {
		super();
		Id = id;
		Name = name;
		DOB = dOB;
		Course = course;
		MobNumber = mobNumber;
	}

 
}
