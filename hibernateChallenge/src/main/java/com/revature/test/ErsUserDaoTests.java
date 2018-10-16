package com.revature.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.revature.dao.ErsUserDao;
import com.revature.model.ErsUser;
import com.revature.model.UserRole;

import junit.framework.TestCase;

public class ErsUserDaoTests extends TestCase {

	@Test
	public void testSaveUser() {
		ErsUserDao dao = new ErsUserDao();
		
		ErsUser u1 = new ErsUser();
		u1.setId(12345);
		u1.setUsername("josephdg3");
		u1.setPassword("pass");
		u1.setFirstName("Joe");
		u1.setLastName("Gonz");
		u1.setEmail("josep@test.com");
		u1.setUserRole(new UserRole(123456, "employee"));
		
		int actual = dao.saveUser(u1);
		assertEquals(1, actual);
		
		ErsUser u2 = new ErsUser();
		u2.setId(67891);
		u2.setUsername("john01");
		u2.setPassword("pass");
		u2.setFirstName("John");
		u2.setLastName("Gabe");
		u2.setEmail("john01@test.com");
		u2.setUserRole(new UserRole(785632, "manager"));
		
		actual = dao.saveUser(u2); 
		assertEquals(1, actual);
	}

	@Test
	public void testGetAllUsers() {
		List<ErsUser> users = new ArrayList<>();
		ErsUserDao dao = new ErsUserDao();

		ErsUser u1 = new ErsUser();
		u1.setId(12345);
		u1.setUsername("josephdg3");
		u1.setPassword("pass");
		u1.setFirstName("Joe");
		u1.setLastName("Gonz");
		u1.setEmail("josep@test.com");
		u1.setUserRole(new UserRole(123456, "employee"));

		users.add(u1);

		ErsUser u2 = new ErsUser();
		u2.setId(67891);
		u2.setUsername("john01");
		u2.setPassword("pass");
		u2.setFirstName("John");
		u2.setLastName("Gabe");
		u2.setEmail("john01@test.com");
		u2.setUserRole(new UserRole(785632, "manager"));		
		
		users.add(u2);

		assertEquals(users, dao.getAllUsers());
	}

	@Test
	public void testGetErsUserByUsername() {
		ErsUserDao dao = new ErsUserDao();
		
		ErsUser u1 = new ErsUser();
		u1.setId(12345);
		u1.setUsername("josephdg3");
		u1.setPassword("pass");
		u1.setFirstName("Joe");
		u1.setLastName("Gonz");
		u1.setEmail("josep@test.com");
		u1.setUserRole(new UserRole(123456, "employee"));
		
		assertEquals(u1, dao.getErsUserByUsername("josephdg3"));
	}

	@Test
	public void testGetErsUserByRole() {
		List<ErsUser> users = new ArrayList<>();
		ErsUserDao dao = new ErsUserDao();
		
		ErsUser u1 = new ErsUser();
		u1.setId(12345);
		u1.setUsername("josephdg3");
		u1.setPassword("pass");
		u1.setFirstName("Joe");
		u1.setLastName("Gonz");
		u1.setEmail("josep@test.com");
		u1.setUserRole(new UserRole(123456, "employee"));
		
		users.add(u1);
		
		assertEquals(users, dao.getErsUserByRole("employee"));
	}

}
