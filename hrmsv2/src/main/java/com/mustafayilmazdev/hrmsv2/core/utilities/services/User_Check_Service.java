package com.mustafayilmazdev.hrmsv2.core.utilities.services;

public interface User_Check_Service {
	boolean checkIfRealPerson(long nationalityId, String firstName, String lastName);
}
