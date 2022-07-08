package homeworkDay3;

public class Instructor extends User{
	private String givenCourses;
	private int numberOfStudent;
	
	public Instructor() {
		
	}
	
	public Instructor(String givenCourses, int numberOfStudent) {
		super();
		this.givenCourses = givenCourses;
		this.numberOfStudent = numberOfStudent;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}
}
