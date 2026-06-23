package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.UserAPI;
import io.restassured.response.Response;
import models.User;

public class UserPojoTest {
	
	@Test
	public void verifyUserPojoMapping() {
		
		UserAPI userAPI = new UserAPI();
		
		Response response =
				userAPI.getUser(1);
		
		User user =
				response.as(User.class);
		
		System.out.println(
				"Name : " + user.getName());
		
		System.out.println(
				"Email : " + user.getEmail());
		
		Assert.assertEquals(
				user.getId(), 
				1);
	}

}
