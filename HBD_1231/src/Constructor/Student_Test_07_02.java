package Constructor;

import java.time.LocalDate;

public class Student_Test_07_02 {

	public static void main(String[] args) {

		Student_07_02 s1 = new Student_07_02();
		Student_07_02 s2 = new Student_07_02(101,"Vikas", LocalDate.of(2025,2,6), "MCS");
		Student_07_02 s3 = new Student_07_02(101,"Jaydeep", LocalDate.of(2025,2,6), "MCS", "8888888");

		System.out.println(s1.Id + " " + s1.Name + " "+ s1.DOB + " " + s1.Course + " " + s1.MobNumber);
		System.out.println(s2.Id + " " + s2.Name + " "+ s2.DOB + " " + s2.Course + " " + s2.MobNumber);
		System.out.println(s3.Id + " " + s3.Name + " "+ s3.DOB + " " + s3.Course + " " + s3.MobNumber);
		// super() this() constructor call can be only on the first line of constructor.

	}

}
