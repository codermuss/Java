package interfaceAbstractDemo;

import java.time.LocalDate;

public class Customer implements IEntity {

	public int ID;
	public String FirstName;
	public String LastName;
	public LocalDate birthOfDate;
	public String NationalityID;

	public Customer(int iD, String firstName, String lastName, String nationalityID, LocalDate birthofDate) {
		super();
		ID = iD;
		FirstName = firstName;
		LastName = lastName;
		NationalityID = nationalityID;
		this.birthOfDate = birthofDate;
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

	public String getNationalityID() {
		return NationalityID;
	}

	public void setNationalityID(String nationalityID) {
		NationalityID = nationalityID;
	}

}
