package ders_3_inheritanceOdev;

public class User {
	final protected int ID;
	protected String name;
	final protected String nickName;
	protected String password;

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	User(int ID, String name, String nickName, String password) {
		this.ID = ID;
		this.name = name;
		this.nickName = nickName;
		this.password = password;
	}

}
