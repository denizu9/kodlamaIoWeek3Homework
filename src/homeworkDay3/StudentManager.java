package homeworkDay3;

public class StudentManager extends UserManager{
	public void attendance(User user) {
		System.out.println("You are all set! Now you can back to the class" + " " + user.getFirstName());
	}
}
