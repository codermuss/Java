package odev3.Model;

import java.time.LocalDate;

public class Admin extends User {
	String auth;

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

	public Admin(int iD, String nationalityId, String firsName, String lastName, LocalDate birthOfDate, String email,
			String password) {
		super(iD, nationalityId, firsName, lastName, birthOfDate, email, password);
		// TODO Auto-generated constructor stub
	}

}
