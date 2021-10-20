package com.bridglab.Junit;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	UserRegistration userRegistration = new UserRegistration();


	@Test
	public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Ashish");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
		boolean result = userRegistration.firstName("ashish");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Surja");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("surja");
		Assert.assertEquals(false, result);
	}
	/*
	 * methods to check mail addresss
	 */
	@Test
	public void givenEmail_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.emailAddress("abc@gmail.com.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.emailAddress("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

	/*
	 * test cases for mobile number validation
	 */
	@Test
	public void givenPhoneNumber_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.phoneNumber("91 9604315270");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenOurOfFormat_ShouldReturnFlase() {
		boolean result = userRegistration.phoneNumber("+91 9604315270");
		Assert.assertEquals(false, result);
	}
	/*
	 * method to validate password
	 */
	@Test
	public void givenPassword_WhenInFormat_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule1("abcdegfhij");
		Assert.assertEquals(true, result);
	}
	@Test
	public void givenPassword_WhenOurOfFormat_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule1("abcd");
		Assert.assertEquals(false, result);
	}


}