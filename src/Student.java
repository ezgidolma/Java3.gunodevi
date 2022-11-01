
public class Student  extends User{

	 private String  courseTaken;
	 private Instructor instructor;
	
	 public Student() {
			
		}
		
		public Student(String courseTaken, Instructor instructor) {
			super();
			this.courseTaken = courseTaken;
			this.instructor = instructor;
		}

		public String getCourseTaken() {
			return courseTaken;
		}

		public void setCourseTaken(String course) {
			this.courseTaken = course;
		}

		public Instructor getInstructor() {
			return instructor;
		}

		public void setInstructor(Instructor instructor) {
			this.instructor = instructor;
		}





}
