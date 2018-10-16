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
		
		ErsUser user = new ErsUser();
		user.setId(12345);
		user.setUsername("josephdg3");
		user.setPassword("pass");
		user.setFirstName("Joe");
		user.setLastName("Gonz");
		user.setEmail("josep@test.com");
		user.setUserRole(new UserRole(123456, "employee"));
		
		int actual = dao.saveUser(user);
		assertEquals(1, actual);
	}

	@Test
	public void testGetAllUsers() {
		List<ErsUser> users = new ArrayList<>();
		ErsUserDao dao = new ErsUserDao();

		ErsUser user = new ErsUser();
		user.setId(12345);
		user.setUsername("josephdg3");
		user.setPassword("pass");
		user.setFirstName("Joe");
		user.setLastName("Gonz");
		user.setEmail("josep@test.com");
		user.setUserRole(new UserRole(123456, "employee"));
		users.add(user);

		user.setId(67891);
		user.setUsername("john01");
		user.setPassword("pass");
		user.setFirstName("John");
		user.setLastName("Gabe");
		user.setEmail("john01@test.com");
		user.setUserRole(new UserRole(785632, "manager"));
		dao.saveUser(user);
		users.add(user);

		boolean actual = users.equals(dao.getAllUsers());
		assertEquals(true, actual);
	}

	@Test
	public void testGetErsUserByUsername() {
		ErsUserDao dao = new ErsUserDao();
		
		ErsUser user = new ErsUser();
		user.setId(12345);
		user.setUsername("josephdg3");
		user.setPassword("pass");
		user.setFirstName("Joe");
		user.setLastName("Gonz");
		user.setEmail("josep@test.com");
		user.setUserRole(new UserRole(123456, "employee"));
		
		boolean actual = user.equals(dao.getErsUserByUsername("josephdg3"));
		assertEquals(true, actual);
	}

	@Test
	public void testGetErsUserByRole() {
		List<ErsUser> users = new ArrayList<>();
		ErsUserDao dao = new ErsUserDao();
		
		ErsUser user = new ErsUser();
		user.setId(12345);
		user.setUsername("josephdg3");
		user.setPassword("pass");
		user.setFirstName("Joe");
		user.setLastName("Gonz");
		user.setEmail("josep@test.com");
		user.setUserRole(new UserRole(123456, "employee"));
		users.add(user);
		
		boolean actual = users.equals(dao.getErsUserByRole("employee"));
		assertEquals(true, actual);
	}

}
