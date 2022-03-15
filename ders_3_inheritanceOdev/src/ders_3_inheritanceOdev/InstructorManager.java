package ders_3_inheritanceOdev;

public class InstructorManager extends UserManager {

	@Override
	public void addUser(User user) {
		System.out.println("Instructor eklendi: " + user.getName());
	}

}
