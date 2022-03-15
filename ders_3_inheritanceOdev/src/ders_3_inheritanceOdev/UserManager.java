package ders_3_inheritanceOdev;

public class UserManager {

	public void addUser(User user) {
		System.out.println(user.getNickName() + " kullanici adli kullanici " + user.ID + " ID'yle eklendi: ");
	}

	public void deleteUser(User user) {
		System.out.println(user.getID() + " ID'li kullanici " + user.getNickName() + " silindi.");
	}

	public void logIn(User user) {
		System.out.println(user.getNickName() + " adli kullanici giris yapti");
	}

	public void logOut(User user) {
		System.out.println(user.getNickName() + " adli kullanici çýkýþ yaptý");
	}
}
