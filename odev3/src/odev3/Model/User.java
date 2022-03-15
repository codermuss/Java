package odev3.Model;

import java.time.LocalDate;

public class User {
	int ID;
	String nationalityId;
	String firsName;
	String lastName;
	LocalDate birthOfDate;

	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	String email;
	String password;
	public static User[] userList = new User[5];
	public static int count = 0;

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int iD, String nationalityId, String firsName, String lastName, LocalDate birthOfDate, String email,
			String password) {
		super();
		ID = iD;
		this.nationalityId = nationalityId;
		this.firsName = firsName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.email = email;
		this.password = password;
	}

}
