package homeworkDay3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setEmail("engindemirog@gmail.com");
		instructor1.setNumberOfStudent(12500);
		instructor1.setGivenCourses("Java, C#, JavaScript");
		instructor1.setPassword("123456");
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Deniz");
		student1.setLastName("Ural");
		student1.setPassword("789");
		student1.setTakenCourses("Java");
		student1.setEmail("dnzu@yahoo.com");
		
		
		User[] users = {student1,instructor1};
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signIn(instructor1);
		instructorManager.signUp(instructor1);
		instructorManager.assignHomework();
		
		StudentManager studentManager = new StudentManager();
		studentManager.signIn(student1);
		studentManager.signUp(student1);
		studentManager.attendance(student1);
		
		
	
	}

}
