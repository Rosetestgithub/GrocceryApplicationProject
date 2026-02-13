package utilities;

import com.github.javafaker.Faker;

public class FakerUtility {
	Faker faker=new Faker();
	public String createUserRandomUsername() {
		return faker.name().username();
	}
	public String createUserRandomPassword() {
		return faker.internet().password();
	}
	public String createUserRandomFullName() {
		return faker.name().fullName();
	}
	public String createUserRandomAddress() {
		return faker.address().fullAddress();
	}
	public String createUserRandomPhoneNumber() {
		return faker.phoneNumber().phoneNumber();
	}
}
