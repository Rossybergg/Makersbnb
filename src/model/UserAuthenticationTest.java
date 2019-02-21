package model;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserAuthenticationTest {

	@Test
	public void test() {
		UserAuthentication ua = new UserAuthentication();
		assertEquals(true, ua.isValidUser("user"));
		assertEquals(false, ua.isValidUser("badUser"));
	}

}
