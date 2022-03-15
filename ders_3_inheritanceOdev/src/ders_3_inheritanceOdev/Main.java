package ders_3_inheritanceOdev;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instructor engin = new Instructor(0, "Engin", "engin1", "12345", 1500, 3, "Yazılım");
		Student mustafa = new Student(1, "Mustafa", "mustafa1", "1234", 2, 100);
		User[] users = { engin, mustafa };

		for (User user : users) {
			System.out.println(user.getName());
		}

		UserManager users_ = new UserManager();
		users_.addUser(mustafa);
		users_.addUser(engin);

		users_.logIn(mustafa);
		users_.logIn(engin);

		users_.logOut(mustafa);
		users_.logOut(engin);

		users_.deleteUser(mustafa);
		users_.deleteUser(engin);

		SystemManager sysManager = new SystemManager();
		sysManager.add(new StudentManager(), mustafa);
		sysManager.add(new InstructorManager(), engin);

	}

}
