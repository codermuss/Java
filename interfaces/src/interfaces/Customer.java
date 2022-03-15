package interfaces;

public class Customer {
	private int ID;
	private String firstName;
	private String LastName;

	public Customer() {
	}

	public Customer(int iD, String firstName, String lastName) {

		ID = iD;
		this.firstName = firstName;
		LastName = lastName;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

}
