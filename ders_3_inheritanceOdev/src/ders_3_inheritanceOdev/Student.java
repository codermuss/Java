package ders_3_inheritanceOdev;

public class Student extends User {

	private int numberOfCourses;
	private int gradePointAverage;

	public Student(int ID, String name, String nickName, String password, int numberOfCourses, int gradePointAverage) {
		super(ID, name, nickName, password);
		this.numberOfCourses = numberOfCourses;
		this.gradePointAverage = gradePointAverage;
	}

	public int getNumberOfCourses() {
		return numberOfCourses;
	}

	public void setNumberOfCourses(int numberOfCourses) {
		this.numberOfCourses = numberOfCourses;
	}

	public int getGradePointAverage() {
		return gradePointAverage;
	}

	public void setGradePointAverage(int gradePointAverage) {
		this.gradePointAverage = gradePointAverage;
	}

}
