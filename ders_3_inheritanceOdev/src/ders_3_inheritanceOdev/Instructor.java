package ders_3_inheritanceOdev;

public class Instructor extends User {

	private int numberOfStudent;
	private int numberOfEducation;
	private String majorField;

	public Instructor(int ID, String name, String nickName, String password, int numberOfStudent, int numberOfEducation,
			String majorField) {
		super(ID, name, nickName, password);
		this.numberOfStudent = numberOfStudent;
		this.numberOfEducation = numberOfEducation;
		this.majorField = majorField;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(int numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	public int getNumberOfEducation() {
		return numberOfEducation;
	}

	public void setNumberOfEducation(int numberOfEducation) {
		this.numberOfEducation = numberOfEducation;
	}

	public String getMajorField() {
		return majorField;
	}

	public void setMajorField(String majorField) {
		this.majorField = majorField;

	}

}
