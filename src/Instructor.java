
public class Instructor extends User {
	

	private String courseGiven;
	private Student students;
	
	public Instructor () {
		
	}

	public Instructor(String courseGiven, Student students) {
		super();
		this.courseGiven = courseGiven;
		this.students = students;
	}

	public String getCourseGiven() {
		return courseGiven;
	}

	public void setCourseGiven(String courseGiven) {
		this.courseGiven = courseGiven;
	}

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}


}
