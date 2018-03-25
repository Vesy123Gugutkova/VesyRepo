
public class StudentTest {
	static Student stu0;
	static Student stu1;
	static Student stu2;

	static Student[] students;

	public static void main(String[] args) {
		Student st = new Student("Ivan", 3);
		students = creatStudents();

		System.out.println(st.toString());

		System.out.println(students[0].toString());
		System.out.println(students[1].toString());
		System.out.println(students[2].toString());
	}

	static Student[] creatStudents() {

		Student st1 = new Student("Pesho");
		Student st2 = new Student("Gosho");
		Student st3 = new Student("Traian");

		Student students[] = { st1, st2, st3 };

		return students;
	}

}
