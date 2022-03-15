package ders_3_inheritanceOdev;

public class StudentManager extends UserManager {
	@Override
	public void addUser(User user) {
		System.out.println("Öğrenci eklendi: " + user.name);
	}

}
