package com.mustafayilmazdev.Hrmsmy.core.services.abstracts;

public interface UserCheckService {
	boolean checkIfRealPerson(long nationalityId, String firstName, String lastName, int yearOfBirth);
}
