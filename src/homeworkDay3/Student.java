package homeworkDay3;

public class Student extends User{
	private String takenCourses;
	private int numberOfInstructor;
	
	public Student() {
		
	}
	
	
	public Student(String takenCourses, int numberOfInstructor) {
		super();
		this.takenCourses = takenCourses;
		this.numberOfInstructor = numberOfInstructor;
	}


	public String getTakenCourses() {
		return takenCourses;
	}


	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}


	public int getNumberOfInstructor() {
		return numberOfInstructor;
	}


	public void setNumberOfInstructor(int numberOfInstructor) {
		this.numberOfInstructor = numberOfInstructor;
	}
}
