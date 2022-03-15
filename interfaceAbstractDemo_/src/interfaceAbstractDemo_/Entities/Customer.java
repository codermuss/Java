package interfaceAbstractDemo_.Entities;

import java.time.LocalDate;

import interfaceAbstractDemo_.Abstract.IEntity;

public class Customer implements IEntity {
	public int ID;
	public String FirstName;
	public String LastName;
	public LocalDate birthOfDate;
	public String NationalityID;

	public Customer(int iD, String firstName, String lastName, LocalDate birthOfDate, String nationalityID) {
		super();
		ID = iD;
		FirstName = firstName;
		LastName = lastName;
		this.birthOfDate = birthOfDate;
		NationalityID = nationalityID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(LocalDate birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public String getNationalityID() {
		return NationalityID;
	}

	public void setNationalityID(String nationalityID) {
		NationalityID = nationalityID;
	}
}
