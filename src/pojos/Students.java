package pojos;

public class Students implements Comparable {
	
	private String lastName;
	private String firstName;
	private String grade;
	private int studentId;
	
	
	public Students(String lastName, String firstName, String grade, int studentId) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.grade = grade;
		this.studentId = studentId;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	@Override
	public String toString() {
		return "Students [lastName=" + lastName + ", firstName=" + firstName + ", grade=" + grade + ", studentId="
				+ studentId + "]";
	}


	
	@Override
    public int compareTo(Object o) {
         return this.getLastName().compareTo(((Students) o).getLastName());
    }
	
	
	
	
	
	
	
}
