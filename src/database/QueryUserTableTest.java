package database;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueryUserTableTest extends QueryUserTable {

	@Test
	public void testAllUsers() {
		
		QueryUserTable qt = new QueryUserTable();
		qt.connect();
		
		qt.addUser("s","s","s","s");
		
		// db retrieves dummy username from db table
		assertEquals("test-user", qt.allUsers().get(0));
		
		// isUsername returns true if argument found in db
		assertEquals(true, qt.isUsernameValid("user"));
		
		// isUsername returns false if argument not found in db
		assertEquals(false, qt.isUsernameValid("badUser"));
		
		// isPasswordValid true when correct password
		assertEquals(true, qt.isPasswordValid("user", "password"));
		
		// isPasswordValid false when incorrect password
		assertEquals(false, qt.isPasswordValid("user", "badPassword"));
//		
		
		qt.disconnect();
	}
}
