package Constructor;
public class P_Test_06 {
	public static void main(String[] args) {
		Student_06 s1 = new Student_06(10142, "Me");
		System.out.println(s1.id);
		System.out.println(s1.Name);
		System.out.println(s1.DOB);
		System.out.println(s1.regno);
		System.out.println(s1.course);
		
		System.out.println();
		Student_06 s2 = new Student_06(222, "Shilpa", "16-08-1995", 25462, "BE");
		System.out.println(s2.id);
		System.out.println(s2.Name);
		System.out.println(s2.DOB);
		System.out.println(s2.regno);
		System.out.println(s2.course);		
	}
}
