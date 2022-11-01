
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1= new Instructor();
		instructor1.setFirstName("Ezgi ");
		
		Student student1 = new Student();
		student1.setFirstName("Yusuf");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);

	}

}
