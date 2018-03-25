
public class Student {
	
	static int studentCount;
	private String fullName; 
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public Universite getUni() {
		return uni;
	}

	public void setUni(Universite uni) {
		this.uni = uni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	private int year;
	
	private enum Specialty{
		ELECTROTEHNIQUE, MATH, PHISICS, ASTRONOMICS
	}
	
	private enum Universite{
		SU,TU,UNSS
	}
	
	private Specialty specialty;
	private Universite uni;
	private String email;
	private String phone;
	
	Student (String name) {
		this(name, 0);
	}
	
	Student (String name, int year) {
		this(name,year,null);
	}
	
	Student (String name, int year,Specialty specialty) {
		this(name,year,null,null);
	}
	
	Student (String name, int year,Specialty specialty, Universite univ) {
		this(name,year,specialty,null,null,null);
	}
	
	Student (String name, int year,Specialty specialty, Universite univ, String email) {
		this(name,year,specialty,univ,email,null);
	}
	
	Student (String fullName, int year, Specialty specialty, Universite univ, String email, String phone) {
		this.fullName = fullName;
		this.year = year;
		this.specialty = specialty;
		this.uni = univ;
		this.email = email;
		this.phone = phone;
		studentCount += 1;
		
	}
	
	public String toString () {
		return "The name of the Student is : " + fullName + "\n" +
				 "Year: " + year + "\n" +
				 "Specialty: " + specialty + "\n" +
				 "University: " + uni;
	}
	
	
}
