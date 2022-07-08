package homeworkDay3;

public class UserManager {
	public void signUp(User user) {
		System.out.println("User added to system succesfully! : " + " " + user.getEmail());
	}
	
	public void signIn(User user) {
		System.out.println("Succesfull! " + " " + user.getFirstName());
	}
	
	public void changePass(User user) {
		System.out.println("Succesfully Changed Password : " + " " + user.getEmail());
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			signUp(user);
		}
	}
}
