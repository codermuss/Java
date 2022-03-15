package odev3.Model;

import java.time.LocalDate;

public class Gamer extends User {

	String name;

	public Gamer(int iD, String nationalityId, String firsName, String lastName, LocalDate birthOfDate, String email,
			String password) {
		super(iD, nationalityId, firsName, lastName, birthOfDate, email, password);
		// TODO Auto-generated constructor stub
	}

}
